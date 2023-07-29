const API_URL = "http://localhost:3000/todos";

let todoApis = {
    getAllTodo(){
        return axios.get(API_URL);
    },
    createTodo(newTodo){
        return axios.post(API_URL, newTodo);
    },
    updateTodo(todo){ // todo = {id, title, status}
        const { id, ...updatedTodo } = todo; // updatedTodo = {title, status}
        return axios.put(`${API_URL}/${id}`, updatedTodo);
    },
    deleteTodo(id){
        return axios.delete(`${API_URL}/${id}`);
    }
}

const todoListEl = document.querySelector("ul");
const renderTodo = (arr) => {
    todoListEl.innerHTML = "";
    if (arr.length === 0) {
        todoListEl.insertAdjacentHTML(
            "afterbegin",
            "<li>Không có công việc nào trong danh sách</li>"
        );
        return;
    }
    let html = "";
    arr.forEach((t) => {
        html += `
            <li>
                <input type="checkbox" ${t.status ? "checked" : ""} onclick="toggleStatus(${t.id})">
                <span class="${t.status ? "active" : ""}">${t.title}</span>
                <button onclick="editTodo(${t.id})">Edit</button>
                <button onclick="deleteTodo(${t.id})">Delete</button>
            </li>
        `;
    });
    todoListEl.innerHTML = html;
};


//Hiển thị danh sach todo
// Gọi API -> ds todos
// ds -> Hiển thị UI
const getAllTodo = async() => {
    try {
        let rs = await todoApis.getAllTodo();
        console.log(rs);

        renderTodo(rs.data);
    } catch (error) {
        console.log(error);
    }
}
// 2. Tạo todo
const btnAdd = document.querySelector("#btn-add");
const inputEl = document.querySelector("#todo-input");

const createTodo = async () => {
    const title = inputEl.value.trim();

    if (!title) {
        alert("Vui lòng nhập nội dung công việc!");
        return;
    }

    try {
        const newTodo = { title, status: false };
        let rs = await todoApis.createTodo(newTodo);
        console.log(rs);

        // Thêm công việc mới vào danh sách công việc hiện có
        const addedTodo = rs.data;
        todos.push(addedTodo);

        // Cập nhật danh sách công việc hiển thị trên giao diện
        renderTodo(todos);

        inputEl.value = "";
    } catch (error) {
        console.log(error);
    }
};
const deleteTodo = async (id) => {
    try {
        await todoApis.deleteTodo(id);
        console.log(`Deleted todo with id=${id}`);

        // Xóa công việc khỏi danh sách công việc hiện có
        todos = todos.filter((t) => t.id !== id);

        // Cập nhật danh sách công việc hiển thị trên giao diện
        renderTodo(todos);
    } catch (error) {
        console.log(error);
    }
};
const editTodo = async (id) => {
    try {
        const todoToEdit = todos.find((t) => t.id === id);
        const newTitle = window.prompt("Nhập nội dung mới", todoToEdit.title);

        if (!newTitle) {
            return;
        }

        const updatedTodo = { ...todoToEdit, title: newTitle };
        let rs = await todoApis.updateTodo(updatedTodo);
        console.log(rs);

        // Cập nhật công việc trong danh sách công việc hiện có
        const index = todos.findIndex((t) => t.id === id);
        todos[index] = rs.data;

        // Cập nhật danh sách công việc hiển thị trên giao diện
        renderTodo(todos);
    } catch (error) {
        console.log(error);
    }
};

btnAdd.addEventListener("click", createTodo);

getAllTodo();
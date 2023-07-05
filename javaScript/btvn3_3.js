const ul = document.getElementById("list");
// Tạo chuỗi HTML chưa 3 phần tử mới
const newItems = "<li>Item 8</li><li>Item 9</li><li>Item 10</li>";
//thêm chuối HTML vào cuối danh sách <ul>
list.insertAdjacentHTML("beforeend", newItems);

const item1 = list.querySelector("li:nth-child(1)");
item1.style.color = "red";

const item3 = list.querySelector("li:nth-child(3)");
item3.style.background = "blue";

const item4 = list.querySelector("li:nth-child(4)");
list.removeChild(item4);

const newItem4 = document.createElement("li");
newItem4.innerText="New Item";
// list.insertBefore(newItem4,item3.nextSibling);
item3.insertAdjacentElement("afterend",newItem4);

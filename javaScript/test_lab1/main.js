
const users = [
    {
      name: "User 1",
      quote: "Quote 1",
      image: "https://randomuser.me/api/portraits/men/41.jpg",
      color: "#F31559"
    },
    {
      name: "User 2",
      quote: "Quote 2",
      image: "https://randomuser.me/api/portraits/women/50.jpg",
      color: "#6528F7"
    },
    {
      name: "User 3",
      quote: "Quote 3",
      image: "https://randomuser.me/api/portraits/women/22.jpg",
      color: "#F1C93B"
    },
    {
      name: "User 4",
      quote: "Quote 4",
      image: "https://randomuser.me/api/portraits/women/76.jpg",
      color: "#FF9B9B"
    },
    {
      name: "User 5",
      quote: "Quote 5",
      image: "https://randomuser.me/api/portraits/men/17.jpg",
      color: "#A2FF86"
    }
  ];
  
  const testimonialsContainer = document.querySelector(".testimonials-container");
  const text = document.querySelector(".text");
  const name = document.querySelector(".name");
  const container = document.querySelector(".authors-container");

  // Tạo các phần tử html tương ứng với mỗi user
    users.forEach(user => {
    const author = document.createElement("div");
    author.classList.add("author");
    author.innerHTML = `<img src="${user.image}">`;
    container.appendChild(author);
  
    
    // Thêm sự kiện "click" cho phần tử html
   
    testimonialsContainer.style.backgroundColor = users[0].color;
    // testimonialsContainer.textContent = users[0].name;
    // testimonialsContainer.textContent = users[0].quote;
    author.addEventListener("click", () => {


      // Hiển thị thông tin của user được chọn
      
      const nameElement = document.querySelector(".name");
      const quoteElement = document.querySelector(".text");
      const color = user.color;
      const quote = user.quote;
      const name = user.name;
      nameElement.textContent = name;
      quoteElement.textContent = quote;
      testimonialsContainer.style.backgroundColor = color;

      // Lấy tất cả các phần tử html của user
      const authors = document.querySelectorAll(".author");
  
      // Xóa class "selected" của tất cả các phần tử html user
      authors.forEach(author => {
        author.classList.remove("selected");
        author.querySelector("img").style.transform = "scale(1)";
      });
  
      // Thêm class "selected" và tăng kích thước ảnh của user được chọn
      author.classList.add("selected");
      author.querySelector("img").style.transform = "scale(1.2)";
    });
  });
  
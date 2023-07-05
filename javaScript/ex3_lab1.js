const heading = document.getElementById("heading");
heading.style.color = "red";
heading.style.textTransform = "uppercase";
console.log(heading);

const para = document.querySelector(".para");
para.style.color = "blue";
para.style.fontSize = "20px";
console.log(para);

const para3 = document.querySelector(".para-3");
para3.insertAdjacentHTML("afterend",`<a href="facebook.com">facebook</a>`);

const heading2 = document.getElementById("title");
heading2.innerText = "Đây là thẻ tiêu đề";

const description = document.querySelector(".description");
let newElement = document.createElement("button");
newElement.innerText = "Click me";
description.parentNode.replaceChild(newElement,description);

const para2 = document.querySelector(".para-2");
const para2Copy = para2.cloneNode(true);
document.body.insertBefore(para2Copy,para3);    

document.body.removeChild(para);

// sửa tên class
description.classList.add("text-bold");
description.classList.remove("description");
console.log(description);

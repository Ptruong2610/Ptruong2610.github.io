const heading = document.getElementById("heading");
console.log(heading);

const heading1 = document.querySelector("#heading");
console.log(heading1);

// ? truy caapj p1,p2,p3

const p1 = document.querySelector("p");
const p2 = document.querySelector(".para");
const p3 = document.querySelector(".para + .para");
console.log(p3);

//div + ul>li:nth-of-type(3)
const li3 = document.querySelector("div + ul .li + li");
console.log(li3);

const paralist = document.querySelectorAll("p");
console.log(paralist);

for (let i = 0; i < paralist.length; i++) {
    paralist[i].style.color = "yellow";
    paralist[i].style.backgroundColor = "blue"; 
}

Array.from(paralist).map(e => console.log(e));

//Get//Set content
const ul1 = document.querySelector(".box ul");
console.log(ul1.innerHTML); // lay ra ca the va noi dung
console.log(ul1.innerText); // lay ra noi dung nhung khong lay duoc the an
console.log(ul1.textContent); // lay ra noi dung va noi dung an 

heading.innerHTML = "xin chao";
heading.innerHTML ="<span>Hello</hello>";

heading.innerText ="<span>Hello</hello>";

const socialMedia = [
    {
        label: "Google",
        link: "https://google.com"
    },
    {
        label: "Facebook",
        link: "https://Facebook.com"
    },
    {
        label: "instagram",
        link: "https://ww.instagram.com"
    }
]

const social = document.querySelector(".social-media");

const render = list =>{
    social.innerHTML = "";
    let html ="";
    list.forEach(element => {
        html += `
        <p>
        <a href="${element.link}">${element.label}</a>
        </p>`;
        // html += "<a href="+element.link+">+element.label+</a>";
    });
    social.innerHTML = html;
}
render(socialMedia);

//them phan tu - createElement
const btn = document.createElement("button");
btn.innerText = "Click me";
document.body.prepend(btn);//them vao dau body, vao cuoi la appendchile

//copy 1 phan tu va day no ve cuoi body - cloneNode
const btnCopy = btn.cloneNode(true);
document.body.appendChild(btnCopy);
console.log(btn);

//c1: them 1 phan tu truoc 1 phan tu duoc xac dinh - insertBefore
const btnCopy1 = btn.cloneNode(true);
const scriptEl = document.querySelector(".script");
document.body.insertBefore(btnCopy1,scriptEl);

//Insert part 2
p3.insertAdjacentHTML("afterend",`<input type="text" placeholder="Enter name"/>`);
p1.insertAdjacentElement("beforebegin",btn.cloneNode(true));

//Xoa
document.body.removeChild(p1);
p2.parentElement.removeChild(p2);

//Thay the(sua)
let newElement = document.createElement("h1");
newElement.innerText = "Xin chao cac ban";
document.body.replaceChild(newElement,p3);

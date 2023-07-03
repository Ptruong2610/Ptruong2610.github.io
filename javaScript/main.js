console.log("Hello world"); //in
//alert("Hello");
// Khai báo biến và không gán giá trị cho biến
let age;
age = 35;
console.log(age); //in
// Khai báo biến và gán giá trị cho biến
let email = "hien@techmaster.vn"

const PI = 3.14;
//javascript int number, string, boolean, null, undefined, symbol
const status = true;
//  const name = null;
userId = undefined;

// ES6 : Template string
let name = "Bùi Hiên";
let year = 1997;

console.log(`Xin chào các bạn, mình tên là ${name}. Năm nay ${2022 - year} tuổi`);
console.log("Xin chào các bạn, mình tên là " + name + ". Năm nay " + (2023 - year) + " tuổi");

console.log(1 + "0"); //"10"
console.log(1 - "0"); // 1
console.log(2 * "2"); // 4
console.log("9" / 3); // 3
console.log("2" * "3");// 6 
console.log("2" * "3a");// NaN - not a number

//Method & Function
// Method được định nghĩa trong class và phải gắn tiền với đối tượng

//c1 : regular function
function sum(a, b) {
    return a + b;
}

//c2: function expression //Default parameter(ES6)
const sum1 = function (a = 20, b = 30) {
    return a + b;
}

//c3: Arrow function (ES6)
const sum2 = (a, b) => {
    return a + b;
}
// or:  const sum2 = (a,b) => a +b;
console.log(sum(3, 4));
console.log(sum1(3, 4));
console.log(sum2(3, 4));

console.log(sum1(10)); // a = 10 , b = undefine -> a+b = NaN
console.log(sum1()); // a= undefine, b= undefine -> a+b = NaN

//phạm vi của biến sẽ nằm trong  {}
{
    let fullName = "Phan Quang Trường"; // biến
    console.log(fullName);
}
// console.log(fullName);

const str = (a) => {
    return a.repeat(10);
}
console.log(str("a"));

const repeatString = (a) => {
    let resul = "";
    for (let i = 1; i <= 10; i++) {

        if (i == 10) {
            resul += a;
            continue;
        }
        resul += a + '-';
    }
    return resul;
}
console.log(repeatString("trường"));

const repeatString1 = (a, n) => {
    let resul = "";
    for (let i = 1; i <= n; i++) {
        if (i == n) {
            resul += a;
            continue;
        }
        resul += a + '-';
    }
    return resul;
}

console.log(repeatString1("a", 6));


let tong = 0;
for (let i = 0; i <= 100; i++) {
    if (i % 5 == 0) {
        tong += i;
    }
}
console.log(tong);

const spherical = (r) => {

    let v = 4 / 3 * Math.PI * Math.pow(r, 3);
    return v;
}
console.log(spherical(5));

// Khai báo array rỗng
let arr = [];

// Khai báo array
let number = [];

// Gán giá trị cho các phần tử của array thông qua chỉ số
number[0] = 1;
number[1] = "Bùi Hiên";
number[2] = true;

// Khai báo và khởi tạo giá trị cho array
let myArr = [1, 2, 3, 4, true, false, "Nguyễn Văn A"];

console.log(myArr);

const maxNumber = (arr) => {
    let max = arr[0];
    arr.forEach(e => {
        if (max < e) {
            max = e;
        }  
        
    })
    return max; 
  
}
console.log(maxNumber([12,3,5,15,4,2,10]));

const modulo2 = (arr) =>{
    return arr.map((e) => e%2);
}
console.log(modulo2([4, 2, 5, 6, 2, 7]));

const copyString = (a) =>{
    let str = [];
  for(let i=0;i<10;i++){
    str.push(a);
  }
  return str.join('');
}
console.log(copyString('truong'));

const copyString1 = (a) =>{
    let str = [];
  for(let i=0;i<10;i++){
    str.push(a);    
  }
  return str.join('-');
}
console.log(copyString1('truong'));

const isSymmetricString = (a) =>{
    let b = str.split('').reverse().join('');
    if(a===b)
    return true;
    else
    return false;
}
console.log(isSymmetricString('Racecar'));
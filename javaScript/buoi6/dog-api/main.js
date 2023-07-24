//URL - GET : https://dog.ceo/api/breeds/image/random
//CÁCH 1: fetch API (build-in Javascript)
//cách 2: axios (3rd - library)

const imageEl =document.querySelector("img");
Promise
const fetchImage = ()=>{
    fetch("https://dog.ceo/api/breeds/image/random")
    .then(res =>{
        console.log(res);
        return res.json();
    })
    .then(res =>{
        console.log(res);
        imageEl.src=res.message;
    })
    .catch(err =>{
        console.log(err);
    })
}

// Async Await + fetch
// const fetchImage = async () =>{
//     let res = await fetch("https://dog.ceo/api/breeds/image/random");
//     let reJson = await res.json();
//     console.log(reJson);
//     imageEl.src = res.message;
// }

// const fetchImage = async ()=>{
//     try {
//         let res = await axios.get("https://dog.ceo/api/breeds/image/random");
//         console.log(res);
//         imageEl
//     } catch (error) {
        
//     }
// }
fetchImage();
 // Lấy danh sách breed từ API và hiển thị trong ô select

 fetch("https://dog.ceo/api/breeds/list/all")
 .then(response => response.json())
 .then(data => {
    const breedSelect = document.getElementById("breedSelect");
   for (const breed in data.message) {
     const option = document.createElement("option");
     option.value = breed;
     option.textContent = breed;
     breedSelect.appendChild(option);
   
   }
 })
 .catch(error => console.error(error));



// Lấy danh sách sub-breed khi người dùng bấm nút "Get Sub Breeds"
const subBreedButton = document.getElementById("subBreedButton");

subBreedButton.addEventListener("click", () => {
 const breedSelect = document.getElementById("breedSelect");
 const breed = breedSelect.value;
 const subBreedList = document.getElementById("subBreedList");
 const randomImage = document.getElementById("randomImage");
 subBreedList.textContent = "Sub Breeds List:";


 // Xóa danh sách sub-breed cũ (nếu có)
 while (subBreedList.firstChild) {
   subBreedList.removeChild(subBreedList.firstChild);
 }

 // Lấy danh sách sub-breed từ API và hiển thị trên trang web
 fetch(`https://dog.ceo/api/breed/${breed}/list`)
   .then(response => response.json())
   .then(data => {
     if (data.message.length > 0) {
       for (const subBreed of data.message) {
       
         const listItem = document.createElement("li");
         listItem.textContent = subBreed;
         listItem.addEventListener("click", () => {
           // Lấy ảnh random từ sub-breed và hiển thị trên trang web
           fetch(`https://dog.ceo/api/breed/${breed}/${subBreed}/images/random`)
             .then(response => response.json())
             .then(data => {
               randomImage.innerHTML = `<img src="${data.message}" alt="${subBreed}">`;
          
             })
             .catch(error => console.error(error));
         });
         subBreedList.appendChild(listItem);
       }
     } else {
       const listItem = document.createElement("li");
       listItem.textContent = "Không tìm thấy sub breed.";
       subBreedList.appendChild(listItem);
     }
   })
   .catch(error => console.error(error));

   randomImage.innerHTML = `<img src="" alt="">`;
});


// Lắng nghe sự kiện click của button "Change content"
document.getElementById("btn-1").onclick = function() {
    document.getElementById("text").innerHTML = "This is a new quote";
  };
  
  // Thay đổi màu sắc của thẻ p khi nhấn vào button "Change color"
  document.getElementById("btn-2").onclick = function() {
    var randomColor = Math.floor(Math.random()*16777215).toString(16);
    document.getElementById("text").style.color = "#" + randomColor;
  };
  
  // Thay đổi màu nền của trang web khi nhấn vào button "Change background"
  document.getElementById("btn-3").addEventListener("click", function() {
    var randomRed = Math.floor(Math.random()*256);
    var randomGreen = Math.floor(Math.random()*256);
    var randomBlue = Math.floor(Math.random()*256);
    document.body.style.backgroundColor = "rgb(" + randomRed + "," + randomGreen + "," + randomBlue + ")";
  });
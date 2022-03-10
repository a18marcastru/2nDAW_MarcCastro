var cat = document.getElementById("cat");
var cat2 = document.getElementById("cat2");
cat.addEventListener('click', function(){
    let contador = document.getElementById("contador").innerHTML;
    contador++;
    document.getElementById("contador").innerHTML = contador;
 });
 cat2.addEventListener('click', function(){
    let contador = document.getElementById("contador2").innerHTML;
    contador++;
    document.getElementById("contador2").innerHTML = contador;
 });
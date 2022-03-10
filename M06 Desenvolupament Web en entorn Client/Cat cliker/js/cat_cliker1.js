var cat = document.getElementById("cat");
cat.addEventListener('click', function(){
    let contador = document.getElementById("contador").innerHTML;
    contador++;
    document.getElementById("contador").innerHTML = contador;
 });
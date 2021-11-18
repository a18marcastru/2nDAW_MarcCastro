document.getElementById("boton").addEventListener('click', function(){
    var nombre = document.getElementById("nombre");
    fetch(`https://www.omdbapi.com/?apikey=35bd8c4e&s=${nombre}`).then(function(res){
        return res.json();
    }).then(function(data) {
        console.log(data);
        datos = data.search[0];
        document.getElementById("title")[0].innerHTML = datos.name.first + " " + datos.name.last;
        
    }).catch(function(){
        console.log("Problem!");
    });
});
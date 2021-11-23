window.onload = function(){
    document.getElementById("nombre").focus();
}
function crearHTML(datos){
    peli = `<div>
            <h2>${datos.Title}</h2>
            <img src="${datos.Poster}"></img>
            </div>`;
    return peli;
}
document.getElementById("enviar").addEventListener('click', function(){
    var nombre = document.getElementById("nombre").value;
    fetch(`https://www.omdbapi.com/?apikey=35bd8c4e&s=${nombre}`).then(function(res){
        return res.json();
    }).then(function(data) {
        let peli = "";
        for(let index = 0;index < 10;index++){
            peli += crearHTML(data.Search[index]);
        }
        console.log(peli);
        document.getElementById("peliculas").innerHTML = peli;
    }).catch(function(){
        console.log("Problem!");
    });
});
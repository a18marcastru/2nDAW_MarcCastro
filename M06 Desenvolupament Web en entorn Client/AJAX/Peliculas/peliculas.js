document.getElementById("botlogin").addEventListener('click', function(){
    let u = document.getElementById("username").value;
    let p = document.getElementById("password").value;

    const datosEnvio = new FormData();
    datosEnvio.append('username',u);
    datosEnvio.append('password',p);
    
    document.getElementById("botlogin").setAttribute("style","display: none;");
    document.getElementById("loading").removeAttribute("hidden");

    fetch('https://labs.inspedralbes.cat/~a18marcastru/AJAX_Pelicula/login.php',{
        method: 'POST',
        body: datosEnvio
    }).then(function(res){
        return res.json();
    }).then(function(data){
        console.log(data);
        document.getElementById("login").setAttribute("style","display: none;");
        document.getElementById("buscar").removeAttribute("style","display: none;");
        htmlstr = "";
        htmlstr += `<h2>Bienvenido ${data.nombre}</h2>
                    <img src="${data.imagen}" alt=""></img>`;
        document.getElementById("inicio").innerHTML = htmlstr;
    }).catch(function(){
        console.log("Problem!");
    });
});

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
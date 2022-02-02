function CargarDatos(){  
    fetch('http://alvaro.alumnes.inspedralbes.cat/goodreads/getBooks.php').then(function(res){
        return res.json();
    }).then(function(data){
        console.log(data);
        libros = "";
        for(let i = 0; i < data.AllBooks.length; i++){
            libros +=`<img height="150px" src="${data.AllBooks[i].cover}" /><h2>${data.AllBooks[i].title}</h2><p>${data.AllBooks[i].author}</p>
            <p>${data.AllBooks[i].summary}</p><button id="${data.AllBooks[i].id}" value="1">Like ${data.AllBooks[i].likes}</button>
            <button id="${data.AllBooks[i].id}" value="0">Dislike ${data.AllBooks[i].dislikes}</button><br><br>`; 
        }   
        document.getElementById("list").innerHTML = libros;   
    });
}

document.addEventListener("DOMContentLoaded",function() {
    //EL TEU CODI AQUI
   CargarDatos();
});

document.getElementById("list").addEventListener('click',function(e){
    console.log(e.target);
    id = e.target.id;
    res = e.target.value;
    console.log(id + " " + res);

    const datosEnvio = new FormData();
    datosEnvio.append('id',id);
    datosEnvio.append('likes',res);

    fetch('http://alvaro.alumnes.inspedralbes.cat/goodreads/incLikesDislikes.php',{
        method: 'POST',
        body: datosEnvio
    }).then(function(){
        CargarDatos();
    }).catch(function(){
        console.log("Problema!")
    });
    
});
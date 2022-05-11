let datos={}

function actualizar() {
    fetch('http://localhost:3000/api/todos').then(function(res){
        return res.json();
    }).then(function(data){
        tascas = "";
        datos = data;
        console.log(datos);
        for(let i = 0; i < datos.length; i++){
            tascas +=`<li class='task ${data[i].completed? 'done':''}' num='${data[i]._id}'>${data[i].name}  <small>${data[i].created_date}</small> <span class="eliminar">X</span>            
            </li>`; 
            
        }   
        document.getElementById("list").innerHTML = tascas;
    });
}

//CREAR TAREA
document.getElementById("btn").addEventListener('click', function(){
    texto = document.getElementById("todoInput").value;
    console.log(texto);
    const tasca = {
        name: texto
    }
    fetch("http://localhost:3000/api/todos",{
        method: 'POST',
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
            },
        body: JSON.stringify(tasca)
    }).then(function(){
        actualizar();
    }).catch(function(){
        console.log("Problema!")
    });
});


//ELIMINAR TAREA
document.getElementById("list").addEventListener("click",function(e) {
    if(e.target.classList.contains("eliminar")){
        console.log(e.target);
        _id = e.target.parentElement.getAttribute("num");
        fetch(`http://localhost:3000/api/todos/${_id}`,{
            method: 'DELETE'
        }).then(function(){
            actualizar();
        });
    }
   /* else if(e.target.classList.contains("editar")) {
        console.log(e.target.getAttribute("num"));
        id = e.target.getAttribute("num")
        nombre = datos[e.target.parentElement.getAttribute("num")].name;
        editor = `<br>name: <input type="text" id="nombre" value="${nombre}">
        <br>
        completed: <input type="checkbox" id="comp" name="completed" value="1">
        <br>
        <button num="${datos[id]._id}" id="sumbit" class="actualizar">Enviar</button>`;
        document.getElementById("editor").innerHTML = editor;
    }*/
});

//EDITAR TAREA
document.getElementById("list").addEventListener("click",function(e) {
    if(e.target.classList.contains("task")){
        console.log("Hola");
        /*nombre = document.getElementById("nombre").value;
        completed = (e.target.parentElement.querySelector("[name='completed']").checked == true) ? true : false;
        _id = e.target.getAttribute("num");
        const tasca = {
            name: nombre,
            completed: completed
        }
        fetch(`http://localhost:3000/api/todos/${_id}`, {
            method: 'PUT',
            headers: {
            'Content-type': 'application/json; charset=UTF-8' 
            },
            body: JSON.stringify(tasca)
        }).then(function(){
            actualizar();
        }).catch(function(){
            console.log("Problema!")
        });*/
    }
});


document.addEventListener("DOMContentLoaded",function() {
    actualizar();
});

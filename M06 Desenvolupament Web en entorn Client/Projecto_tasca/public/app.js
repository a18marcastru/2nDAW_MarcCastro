function actualizar() {
    fetch('http://localhost:3000/api/todos').then(function(res){
        return res.json();
    }).then(function(data){
        console.log(data);
        tascas = "";
        for(let i = 0; i < data.length; i++){
            tascas +=`<li num=='${data[i]._id}'>id: ${data[i]._id}, name: ${data[i].name}, completed: ${data[i].completed}, date: ${data[i].created_date}
            <br>
            <button id="edit" class="btn btn-primary">Edit</button>
            <button id="delete" class="btn btn-danger">Delete</button>
            <br><br></li>`; 
            
        }   
        document.getElementById("list").innerHTML = tascas;   
    });
}

document.addEventListener("DOMContentLoaded",function() {
    actualizar();
});

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

document.addEventListener("click",function(e) {
    console.log(e);
});
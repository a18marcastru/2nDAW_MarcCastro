var data = {
    catActive: 0,
    gatos: [
        { name: "Michifu", content: "lorem", image: "img/cat.jpg", nclicks: 0 },
        { name: "Minino", content: "lorem2", image: "img/cat2.jpg", nclicks: 0 },
        { name: "Garfield", content: "lorem", image: "img/cat3.jpg", nclicks: 0 },
        { name: "Roberto", content: "lorem", image: "img/cat4.jpg", nclicks: 0 }
    ]
};

    var model = {
        init: function() {
            return data;
        },
        getGatoActual: function() {
            return data.gatos[data.catActive];
        }
    };

    var controller = {
        init: function() {
            let data = model.init();
            view.init(data);
        },
        cambioDeGato: function(numGato) {
            data.catActive = numGato;
            view.renderGato(model.getGatoActual());
        },
        contadorImg: function() {
            data.gatos[data.catActive].nclicks++; 
            view.renderGato(model.getGatoActual());
        }
    };

    var view = {
        init: function(data) {
            view.renderLista(data);
        },
        renderGato: function(GATO) {
            document.getElementById("catimg").setAttribute("src",GATO.image);
            document.getElementById("contador").innerHTML = GATO.nclicks;
            document.getElementById("nombre").innerHTML = GATO.name;
        },
        renderLista: function(data){
            var listas = document.getElementById("lista");
            for (let index = 0; index < data.gatos.length; index++) {
                var li = document.createElement("li");
                var atri = document.createTextNode(data.gatos[index].name);
                li.setAttribute("id",index);
                li.appendChild(atri);
                listas.appendChild(li);
            }

            document.getElementById("lista").addEventListener("click",function(e){
                controller.cambioDeGato(e.target.getAttribute("id"));
            });

            document.getElementById("catimg").addEventListener("click",function(e){
                controller.contadorImg(e.target.getAttribute("id"));
            });
        }
    };

    controller.init();

/*
var data = {
    catActive: 0,
    gatos: [
        { name: "Michifu", content: "lorem", image: "img/cat.jpg", nclicks: 0 },
        { name: "Minino", content: "lorem2", image: "img/cat2.jpg", nclicks: 0 },
        { name: "Garfield", content: "lorem", image: "img/cat3.jpg", nclicks: 0 },
        { name: "Roberto", content: "lorem", image: "img/cat4.jpg", nclicks: 0 }
    ]
};

function crear_list() {
    var listas = document.getElementById("lista");
    for (let index = 0; index < data.gatos.length; index++) {
        var li = document.createElement("li");
        var atri = document.createTextNode(data.gatos[index].name);
        li.setAttribute("id",index);
        li.appendChild(atri);
        listas.appendChild(li);
    }
}
 
function imagen() {
    document.getElementById("lista").addEventListener('click', function(e){
        //CAMBIAMOS EL GATO ACTIVO
        data.catActive = e.target.id;
        
        //ACTUALIZAMOS Y MOSTRAMOS TODOS LOS DATOS DEL GATO ACTIVO
        document.getElementById("catimg").setAttribute("src",data.gatos[data.catActive].image);
        document.getElementById("nombre").innerHTML = data.gatos[data.catActive].name;
        document.getElementById("contador").innerHTML = data.gatos[data.catActive].nclicks;
    });
}

function contador() {
    document.getElementById("catimg").addEventListener('click', function(){
        data.gatos[data.catActive].nclicks++;
        document.getElementById("contador").innerHTML = data.gatos[data.catActive].nclicks;
    });
}

crear_list();
imagen();
contador();
*/
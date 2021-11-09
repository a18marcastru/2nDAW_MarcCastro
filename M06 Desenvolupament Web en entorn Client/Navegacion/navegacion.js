function ocultar_divs() {
    let divs = document.getElementsByClassName("modules");
    for(let i = 0;i < divs.length;i++){
        divs[i].style.display="none";
    }
}

function crear_list() {
    let divs = document.getElementsByClassName("modules");
    let lista = document.getElementById("lista");
    for(i = 1;i < divs.length;i++){
        var li = document.createElement("LI");
        var textnode = document.createTextNode("Parte " + i);
        li.setAttribute("num",i);
        li.appendChild(textnode);
        lista.appendChild(li);
    }
    document.addEventListener("click", function(e) => {
        document.getElementById(i).classList.add("seleccionado");
        divs[i - 1].style.display="block";
    });
}

ocultar_divs();
crear_list();
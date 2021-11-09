function ocultar_divs() {
    let divs = document.getElementsByClassName("modules");
    for(let i = 0;i < divs.length;i++){
        divs[i].style.display="none";
    }
}
function crear_list() {
    let divs = document.getElementsByClassName("modules");
    let listas = document.getElementById("lista");
    cont = 1;
    
    for(i = 0;i < divs.length;i++){
        var li = document.createElement("li");
        var atri = document.createTextNode("Parte " + cont++);
        li.setAttribute("num",i);
        li.appendChild(atri);
        listas.appendChild(li);
    }
    listas.addEventListener("click", function(e) {
        let num = e.target.getAttribute("num");
        for(i = 0;i < divs.length;i++){
            if(i == num) {
                divs[i].style.display="block";
            }
            else {
                divs[i].style.display="none";
            }
        }
        //document.getElementById(num).classList.add("seleccionado");
    });
}

ocultar_divs();
crear_list();
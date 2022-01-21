document.getElementById("cambiar").addEventListener('click', function(){
    nom = document.getElementById("nom").value;
    edat = document.getElementById("edat").value;
    document.getElementById("fitxa").setAttribute("style", "background: red;");
    text = "";
    text +=`<p>Nombre: ${nom}</p>
            <p>Edat: ${edat}</p>`;
    document.getElementById("fitxa").innerHTML = text;
});

document.getElementById("cambiar").addEventListener('click', function(){
    
});
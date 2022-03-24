document.getElementById("enviar").addEventListener('click', function(){
    A1 = document.getElementById("A1").value;
    B2 = document.getElementById("B2").value;
    op = document.getElementById("opciones").value;

    const datosEnvio = new FormData();
    datosEnvio.append('a',A1);
    datosEnvio.append('b',B2);
    datosEnvio.append('op',op);

    document.getElementById("loading").removeAttribute("hidden");

    fetch('http://alvaro.alumnes.inspedralbes.cat/calculadora.php', {
        method: 'POST',
        body: datosEnvio
    }).then(function(res){
        return res.json();
    }).then(function(data){
        console.log(data);
        document.getElementById("resultado").innerHTML = data;
        document.getElementById("loading").setAttribute("style","display: none;");
    }).catch(function(){
        console.log("Problem!");
    });
});
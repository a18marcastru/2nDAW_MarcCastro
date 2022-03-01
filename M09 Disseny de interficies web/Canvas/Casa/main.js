window.onload = function () {
    repintarInicial();
    document.getElementById("canvas").addEventListener("mousemove", repintar);
    document.getElementById("canvas").addEventListener("mouseout", repintarInicial);
}

function repintarInicial() {
    repintar();
}

function repintar(e) {

    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");

    pintarFons(context);
    pintarCasa(context);
    pintarVentanas(context);
    pintarPuerta(context);
    pintarTecho(context);

    if(e != null){
        pintarRatoli(e);
    }

    document.addEventListener("keydown", function(event){
        console.log(event.key);
        if(event.key == "G") {
            printRatoli1(e);
        }
        else if(event.key == "B") {
            printRatoli2(e);
        }
        /*else if(event.key == "a") {
            var elim = document.getElementById("canvas");
            console.log(elim);
            elim[0].classList.add('borrar');
        }*/
    });
}

function pintarCasa(context) {
    context.fillStyle = "green";
    context.fillRect(60, 200, 350, 290);
}

function pintarFons(context) {
    context.fillStyle = "#ffffff";
    context.fillRect(0, 0, 500, 500);
    context.strokeRect(1, 1, 500 - 1, 500 - 1);
}

function pintarPuerta(context) {
    context.fillStyle = "blue";
    context.fillRect(190, 370, 70, 120);
}

function pintarVentanas(context) {
    context.fillStyle = "yellow";
    context.fillRect(100, 255, 50, 100);
    context.fillRect(300, 255, 50, 100);
}

function pintarTecho(context) {
    context.beginPath();
    context.fillStyle = "green";
    context.moveTo(240,50);
    context.lineTo(20,200);
    context.lineTo(450,200);
    context.closePath();
    context.fill();
}

function pintarRatoli(e) {
    posX = e.offsetX;
    posY = e.offsetY;
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    context.fillStyle = "#FF0000";
    context.beginPath();
    context.arc(posX, posY, 19, 1, 13);
    context.fill();
}

function printRatoli1(e) {
    posX = e.offsetX;
    posY = e.offsetY;
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    context.fillStyle = "black";
    context.beginPath();
    context.arc(posX, posY, 19, 1, 13);
    context.fill();
}

function printRatoli2(e) {
    posX = e.offsetX;
    posY = e.offsetY;
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    context.fillStyle = "blue";
    context.beginPath();
    context.arc(posX, posY, 19, 1, 13);
    context.fill();
}
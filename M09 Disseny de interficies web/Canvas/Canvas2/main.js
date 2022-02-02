window.onload = function () {
    repintarInicial();
    document.getElementById("canvas").addEventListener("mousemove", repintar);
    document.getElementById("canvas").addEventListener("mouseout", repintarInicial);
}

function repintarInicial() {
    repintar();
}

const zoom = 4;

function repintar(e) {

    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    
    pintarFons(context);
    pintarRec1(context);
    pintarRec3(context);
    
    if(e != null) {
        pintarRatoli(e);
    }
    else {
        pintarBoles(context);
    }
    pintarRec2(context);
}

function pintarFons(context) {
    context.fillStyle = "#ffffff";
    context.fillRect(0, 0, 400, 420);
    context.strokeRect(1, 1, 400 - 1, 420 - 1);
}

function pintarRec1(context) {
    context.fillStyle = "#000000";
    context.fillRect(6 * zoom , 34 * zoom, 26 * zoom, 67 * zoom);
}

function pintarRec2(context) {
    context.fillStyle = "#000000";
    context.fillRect(37 * zoom , 3 * zoom, 26 * zoom, 98 * zoom);
}

function pintarRec3(context) {
    context.fillStyle = "#000000";
    context.fillRect(67 * zoom , 3 * zoom, 26 * zoom, 68 * zoom);
}

function pintarBola1(context) {
    context.beginPath();
    context.fillStyle = "#00aeef";
    context.arc(19 * zoom, 16 * zoom, 13 * zoom , 0, 2 * Math.PI);
    context.fill();
}

function pintarBola2(context) {
    context.beginPath();
    context.fillStyle = "#00aeef";
    context.arc(80 * zoom, 87 * zoom, 13 * zoom , 0, 2 * Math.PI);
    context.fill();
}

function pintarBoles(context) {
    pintarBola1(context);
    pintarBola2(context);
}

function pintarRatoli(e) {
    posX = e.offsetX;
    posY = e.offsetY;
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    context.fillStyle = "#00aeef";
    context.beginPath();
    context.arc(posX, posY, 13 * zoom, 1, 13);
    context.fill();
}
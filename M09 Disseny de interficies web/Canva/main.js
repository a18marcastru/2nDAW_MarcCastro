window.onload = function () {
    pintarCanvas();
    document.getElementById("canvas").addEventListener("mousemove", pintarRatoli);
}

function pintarRatoli(e) {
    pintarCanvas();
    posX = e.offsetX;
    posY = e.offsetY;
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");
    context.fillStyle = "#FF0000";
    context.beginPath();
    context.arc(posX, posY, 19, 1, 13);
    context.fill();
}

function pintarCanvas() {
    var canvas = document.getElementById("canvas");
    var context = canvas.getContext("2d");

    const zoom = 4;

    //Fons 
    context.fillStyle = "#ffffff";
    context.fillRect(0, 0, 400, 420);
    context.strokeRect(1, 1, 400 - 1, 420 - 1);

    //Rectangles
    context.fillStyle = "#000000";
    context.fillRect(6 * zoom , 34 * zoom, 26 * zoom, 67 * zoom);
    context.fillRect(37 * zoom , 3 * zoom, 26 * zoom, 98 * zoom);
    context.fillRect(67 * zoom , 3 * zoom, 26 * zoom, 68 * zoom)

    //Cercles
    context.beginPath();
    context.fillStyle = "#00aeef";
    context.arc(19 * zoom, 16 * zoom, 13 * zoom , 0, 2 * Math.PI);
    context.fill();

    context.beginPath();
    context.arc(80 * zoom, 87 * zoom, 13 * zoom , 0, 2 * Math.PI);
    context.fill();
}
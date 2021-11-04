let alumnos=parseInt(prompt("Introduce la cantidad de alumnos: "));
let acum=0;

for(let i=0;i<alumnos;i++){
    acum+=parseInt(prompt("La nota: "));
}

let media=acum/alumnos;
let mediaL='';

if(media<60)mediaL='F';
else if(media<70)mediaL='D';
else if(media<80)mediaL='C';
else if(media<90)mediaL='B';
else mediaL='A';

document.write(`
<h1>Calculo de las notas</h1>
<p><b>La media total de las notas: ${media} </b></p> 
<p><b>La media total de las letras: ${mediaL} </b></p>
`);
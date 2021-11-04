function imprimirTaula(dimension, numerica, caracter){
    let htmlstr="<table border=1>";
    let cont=1;
    for(let i=0; i < dimension; i++){
        htmlstr+="<tr>";
        for(let j=0; j < dimension; j++){
            if(numerica==1)htmlstr+=`<td>${cont}</td>`;
            else htmlstr+=`<td>${caracter}</td>`;
            ++cont;
        }
        htmlstr+="</tr>";
    }
    htmlstr+="</table>";
    return htmlstr;
}

let dim=parseInt(prompt("Cuanto las dimensiones de la taula: "));
let num=parseInt(prompt("Es numérica? [0/1]"));
let car;
if(num==0){
    car=prompt("Pon un caracter: ");
}


document.write(imprimirTaula(dim, num, car));
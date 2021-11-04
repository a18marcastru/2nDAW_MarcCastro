//Iterativo:
/*function sumadigitosIterativo(numero){
    let suma=0;
    while(numero>0){
        suma+=numero%10;
        numero=parseInt(numero/10);
    }
    return suma;
}*/
//Recursivo:
/*function sumadigitosRecursivo(numero){
    if(numero==0) return numero;
    else{
        return (numero%10+sumadigitosRecursivo(parseInt(numero/10)));
    }
}*/
//Contar digitos:
/*function contardigitosIterativo(numero){
    let contar=0;
    while(numero>0){
        contar++;
        numero=parseInt(numero/10);
    }
    return contar;
}*/
/*function contardigitosRecursivo(numero){
    let contar=0;
    if(numero==0) return numero;
    else{
        return (contar+1+contardigitosRecursivo(parseInt(numero/10)));
    }
}

let num=parseInt(prompt("Introduce un numero y te dira la suma total de los digitos: "));
let res=contardigitosRecursivo(num);
document.write(`<h1>El resultado de los digitos ${num} es: ${res}</h1>`);
*/

const x = function(a,b){
    return a*b;
}

const y = (a,b) => a*b; 

let z=x(4,3);
document.write(z);
document.write("<br>");
document.write(y(8,7));
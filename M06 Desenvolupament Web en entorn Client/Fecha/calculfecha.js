function dia_setmana(año,mes,dia){

    const data = new Date(año,mes-1,dia)
    const nomDies = ['Domingo','Lunes','Martes','Miercoles','Jueves','Viernes'];

    return nomDies[data.getDay()];
}

let d=parseInt(prompt("Escribe un dia: "));
let m=parseInt(prompt("Escribe un mes: "));
let a=parseInt(prompt("Escribe un año: "));
        
document.write(`Hoy es ${dia_setmana(a,m,d)}`);
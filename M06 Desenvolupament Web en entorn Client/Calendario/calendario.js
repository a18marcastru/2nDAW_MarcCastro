function diaMes(a,m){
    return new Date(a,m,0).getDate();
}

function imprimirCalendario(a,m,d){
    //let primerdia = new Date(año,mes-1,1).getDay();
    //let diasMes=dayInMonth(mes,año);
    let htmlstr=`<table border = 3px>`;
    let dia=1;
    const diasMes= diaMes(a,m);
    const nomDies=['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
    //const nomMeses=['Enero','Febero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Setiembre','Octubre','Noviembre','Diciembre',]
    for(let i=0;i<1;i++){
        htmlstr+="<tr>";
        for(let j=0;j<nomDies.length;j++){
            htmlstr+=`<td>${nomDies[j]}</td>`;
        }
        htmlstr+="</tr>";
    }
    for(let i=0;i<5;i++){
        htmlstr+="<tr>";
        for(let j=0;j<7;j++){
            if(diasAsaltar>0) {

            }
            else {
                if(dia<=diasMes) {
                    if(dia==d){
                        htmlstr += `<td id="dia"><b>${dia}</b></td>`;
                    }
                    else{
                        htmlstr += `<td>${dia}</td>`;
                    }            
                }
                dia++;
            }
        }
        htmlstr += "</tr>";
    }
    htmlstr+=`</table>`;
    
    return htmlstr;
}
function diaMes(a,m){
    return new Date(a,m,0).getDate();
}

function primerDia(mes,año){
    let primDia= new Date(año,mes,0);
    firstday = primDia.getDay();
        if(firstday==6){
            firstday=0;
        }
    return firstday;
}

function nombreMes(m) {
    const nomMeses=['Enero','Febero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Setiembre','Octubre','Noviembre','Diciembre',]
    htmlstr = "";
    htmlstr += nomMeses[m-1];
    return htmlstr

}

function imprimirCalendario(a,m,d){
    //let primerdia = new Date(año,mes-1,1).getDay();
    //let diasMes=dayInMonth(mes,año);
    let htmlstr=`<table border = 3px>`;
    let dia=1;
    const diasMes= diaMes(a,m);
    const nomDies=['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
    let diasAsaltar=primerDia(m,a);
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
                diasAsaltar--;
                htmlstr+=`<td></td>`;
            }
            else {
                if(dia<=diasMes) {
                    if(dia==d){
                        htmlstr += `<td id="dia"><b>${dia}</b></td>`;
                    }
                    else{
                        htmlstr += `<td>${dia}</td>`;
                    }
                    dia++;          
                }
                else{
                    htmlstr+=`<td></td>`;
                }
            }
        }
        htmlstr += "</tr>";
    }
    htmlstr+=`</table>`;
    
    return htmlstr;
}
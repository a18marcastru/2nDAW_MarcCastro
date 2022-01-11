<?php
    $dia = date('z');
    if ( $dia < 81 or $dia > 355) {
        $estacio = 'hivern';
    } elseif ( $dia < 171 ) {
        $estacio = 'primavera';
    } elseif ( $dia < 264 ) {
        $estacio = 'estiu';
    } else {
        $estacio = 'tardor';
    }

    $mes=array("gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre");
    $diaSet = array("diumenge","dilluns","dimarts","dimecres","dijous","divendres","dissabte");
    if( date("G") <12){
        $bon = "Bon dia!!!";
    } else {
        $bon = "Bona tarda!!!";
    }

    echo "Estació de l'any: ".$estacio."<br/>";
    echo "Mes de l'any: ". $mes[date("m")-1]. "<br/>";
    echo "Dia de la setmana: ".$diaSet[date("w")]."<br/>";
    echo $bon . "<br>";
?>
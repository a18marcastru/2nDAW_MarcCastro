<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> Activitat 1.3 </title>

</head>
<body>

<?php
/* 1-. A dia d'avui */
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
    
    $mes = array("gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre");
    
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



<?php

/* 2-. Recorrer array  */
 
    $pais['España'] = 46940000;
    $pais['Francia'] = 66990000;
    $pais['Italia'] = 60360000;
    $pais['USA'] = 328200000;
    $pais['Rusia'] = 144500000;

    foreach ($pais as $key => $value) {
        echo $key." té " . $value . " habitants";
        echo "<br>";
    }

?> 


<?php

/*3-. Escriu un script que generi un integer de 8 dígits, calculi la lletra que li correspon de DNI i
 *  mostri pel navegador el resultat de manera llegible.*/
 
    $lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
    $dni = rand(11111111, 99999999);
    $cal = $dni % 23;

    $lletra = substr($lletres, $cal, 1);
    echo "El teu NIF és: " .$dni. $lletra;
 ?>

<?php

/*4-. Dorsals*/

$corredors = array(array("home","xavier","garcía",""),
					array("dona","PILAR","sans",""),
					array("dona","Aina","ROIG",""));
//print_r($corredors);

for ($i=0; $i<count($corredors); $i++)

	$corredors[$i][3]= strtoupper(substr($corredors[$i][0],0,1)) . ucfirst(strtolower(substr($corredors[$i][1],0,3))) .
	ucfirst(strtolower(substr($corredors[$i][2],0,3)));

echo "<table border='1'>";
for ($i=0; $i<count($corredors); $i++) {
	echo "<tr>";
	for ($j=0; $j<4; $j++) 
		echo "<td>". $corredors[$i][$j] . "</td>";
		echo "</tr>";
}
echo "</table>";
	

?>


<?php

/*5-. Implementa un script que mostri per pantalla una graella semblant a la següent:*/

    $taula = '<table border="1">';
    for ($i = 1; $i < 11; $i++) {
        $taula .= '<tr>';
        for ($j = 1; $j < 11; $j++) {

            $taula .= '<td align=center>' . ($i * $j) . '</td>';
        }
        $taula .= '</tr>';
    }

    $taula .= '</table>';
    echo $taula;
?>

</body>
</html>



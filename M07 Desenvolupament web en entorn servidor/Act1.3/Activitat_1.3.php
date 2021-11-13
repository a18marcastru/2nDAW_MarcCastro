<?php

date_default_timezone_set('Europe/Madrid');

$temp_fec = date('l F Y');
$temp_hora = date( 'h:i:s',time())."<br>";

$mesActual = array('Primavera', 'Estiu', 'Tardo', 'Invern');

$diaActual = date('z');
$horaActual = date('g');

echo "La fecha de hoy es el $temp_fec a las $temp_hora";

if($horaActual <= 12){
    echo 'Buenos Dias'."<br>";
}
else{
    echo 'Buenas Tardes'."<br>";
}

if($diaActual <= 171){
    echo "La estacion es $mesActual[0]";
}
else if($diaActual <= 264){
    echo "La estacion es $mesActual[1]";
}
else if($diaActual <= 351){
    echo "La estacion es $mesActual[2]";
}
else{
    echo "La estacion actual es $mesActual[3]";
}
?>

<br><br>

<?php

$pais = array("Espanya"=>"47,450,795","Italia"=>"60.541.000","Portugal"=>"10.160.177");

foreach($pais as $x => $x_value){
    echo "Pais=".$x.", Poblacion=".$x_value;
    echo "<br>";
}
?>

<br><br>

<?php

$lletra = "TRWAGMYFPDXBNJZSQVHLCKE";
$numero = rand(11111111,99999999);
$calc = $numero % 23;

$lletra = substr($lletra,$calc,1);

echo "Tu DNI es $numero"."$lletra";
?>

<br><br>

<?php

$corredores=array(array("H","Marc","Castro",""),
    array("D","Julia","Ramirez",""),
    array("H","Timur","Busquets",""));

for($i=0;$i<count($corredores);$i++){
    $corredores[$i][3]= strtoupper(substr($corredores[$i][0],0,1)).
    ucfirst(strtolower(substr($corredores[$i][1],0,3))).
    ucfirst(strtolower(substr($corredores[$i][2],0,1)));
}
echo"<table border='1'>";
/*for($i=0;$i<count($corredores);$i++){
    echo "<tr>";
    for($j=0;$j<4;$j++){
        echo "<td>".$corredores[$i][$j]."</td>";
        echo "</tr>";
    }
}*/
for($i=0;$i<count($corredores);$i++){
    echo "<tr><td>".$corredores[$i][0]."</td><td>".$corredores[$i][1].
         "</td><td>".$corredores[$i][2]."</td><td>".$corredores[$i][3].
         "</td></tr>";
}
echo "</table>";

?>

<br><br>

<?php

$taula = '<table border="1">';

for ($i = 1; $i < 11; $i++) {
    $taula .= "<tr>";
    for ($j = 1; $j < 11; $j++) {
        $taula .= '<td align=center>' . ($i * $j) . '</td>';
    }
    $taula .= '</tr>';
}

$taula .= '</table>';

echo $taula;

?>

<br><br>

<?php

$ciutat = array("Barcelona", "Madrid", "Paris", "Tokio", "Canton", "Shanghai", "Delhi", "Seul", "Bombay", "Manila");

sort($ciutat);

foreach($ciutat as $key => $val){
    echo $val . ", ";
}

?>

<br><br>

<?php

$ciutat = array("Barcelona", "Madrid", "Paris", "Tokio", "Canton", "Shanghai", "Delhi", "Seul", "Bombay", "Manila");

rsort($ciutat);

foreach($ciutat as $key => $val){
    echo $val . ", ";
}

?>

<br><br>

<?php

$ciutat = array("1" => "Barcelona","2" => "Madrid","3" => "Paris","4" => "Tokio","5" => "Canton","6" => "Shanghai","7" => "Delhi","8" => "Seul","9" => "Bombay","10" => "Manila");

asort($ciutat);

foreach($ciutat as $key => $val){
    echo "$key = $val,\n";
}

?>

<br><br>

<?php

$ciutat = array("1" => "Barcelona","2" => "Madrid","3" => "Paris","4" => "Tokio","5" => "Canton","6" => "Shanghai","7" => "Delhi","8" => "Seul","9" => "Bombay","10" => "Manila");

arsort($ciutat);

foreach($ciutat as $key => $val){
    echo "$key = $val,\n";
}

?>

    <br><br>

<?php

$ciutat = array("1" => "Barcelona","4" => "Madrid","9" => "Paris","8" => "Tokio","7" => "Canton","6" => "Shanghai","2" => "Delhi","3" => "Seul","5" => "Bombay","10" => "Manila");

ksort($ciutat);

foreach($ciutat as $key => $val){
    echo "$key = $val,\n";
}

?>

<br><br>

<?php

$ciutat = array("Barcelona","Madrid","Paris","Tokio","Canton","Shanghai","Delhi","Seul","Bombay","Manila");

shuffle($ciutat);

foreach($ciutat as $key => $val){
    echo $val . ", ";
}

?>

<br><br>



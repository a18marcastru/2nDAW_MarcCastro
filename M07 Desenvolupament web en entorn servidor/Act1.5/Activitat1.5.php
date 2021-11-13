<?php
function suma(){
    $ope = "Suma";

    $num2 = rand(-1000,1000);
    $num3 = rand(-1000,1000);

    $res = $num2 + $num3;
    return array($ope,$num2,$num3,$res);
}
function resta(){
    $ope = "Resta";

    $num2 = rand(-1000,1000);
    $num3 = rand(-1000,1000);

    $res = $num2 - $num3;
    return array($ope,$num2,$num3,$res);;
}
function producto(){
    $ope = "Multiplica";

    $num2 = rand(-1000,1000);
    $num3 = rand(-1000,1000);

    $res = $num2 * $num3;
    return array($ope,$num2,$num3,$res);
}
function dividir(){
    $ope = "Dividir";

    $num2 = rand(-1000,1000);
    $num3 = rand(-1000,1000);

    $res = round($num2 / $num3, 2);
    $residu = $num2 % $num3;
    return array($ope,$num2,$num3,$res,$residu);
}
function raiz(){
    $ope = "Arrel quadrada";

    $num2 = rand(1,1000);

    $res = round(sqrt($num2), 2);
    return array($ope,$num2,$res);
}
function mostrar($resultado){
    if (count($resultado) == 4) {
        echo "Has demanat " . $resultado[0] . " " . $resultado[1] . " i " . $resultado[2] . " . El resultat és: " . $resultado[3];

    } else if (count($resultado) == 3) {
        echo "Has demanat realitzar l'". $resultado[0] . " de " . $resultado[1] . " . El resultat és: " . $resultado[2];
    } else {
        echo "Has demanat " . $resultado[0] . " " . $resultado[1] . " entre " . $resultado[2] . " . El resultat és: " . $resultado[3]
            . " i el residu " . $resultado[4];
    }
}

$num = rand(1,5);

if($num==1){
    $resultado=suma();
    mostrar($resultado);
}
else if($num==2){
    $resultado=resta();
    mostrar($resultado);
}
else if($num==3){
    $resultado=producto();
    mostrar($resultado);
}
else if($num==4){
    $resultado=dividir();
    mostrar($resultado);
}
else if($num==5){
    $resultado=raiz();
    mostrar($resultado);
}
?>


<br><br>

<?php

function sumar($nums){
    $suma=0;
    for($i=0;$i<count($nums);$i++){
        $suma+=$nums[$i];
    }
    return $suma;
}

function perimetro($costat){
    $res = $costat*4;

    return $res;
}

function monedes($diners, $moneda) {

    $nummonedas = 0;
    $queden = $diners;
    while($queden >= $moneda){
        $queden -= $moneda;
        $nummonedas++;
    }
    return array($nummonedas,$queden);
}

$num = 3;

if($num==1){
    $sumands = rand(1,10);
    for($i=0;$i<$sumands;$i++){
        $nums[$i] = rand(-1000,1000);
    }
    $resultado = sumar($nums);
    echo "Has sumado $sumands valores, que da de resultado: $resultado.";
}
else if($num==2){
    $costat = rand(1,10);

    $resultado = perimetro($costat);

    echo "El perimetro del cuadrado de costado $costat es: $resultado";
}
else if($num==3){
    $monedas = array(0.01,0.05,0.1,0.2,0.5,1,2);
    $moneda = $monedas[rand(0,6)];
    $diners = rand(1,1000);
    $resultado = monedes($diners,$moneda);

    echo "A " . $diners . " hi ha " . $resultado[0] . " monedes de " . $moneda . " i en sobren " . round($resultado[1],2) . " diners ";
}

?>

<br><br>

<?php
function matricula($num,$letras){

    try {

        num_mat($num);
        letras_mat($letras);

    } catch(Exception $e) {
        echo " Matricula incorrecta. ";
    }
};

function num_mat($numMat){
    echo $numMat;
    if ($numMat < 0 or $numMat > 9999) {
        throw new Exception (" Numero de la matricula incorrecta");
    } else {
        echo " Nombre correcto";
    }
};

function letras_mat($letras){
    if ( strlen($letras) <> 3 or
        preg_match("/[0-9]/",$letras) or
        preg_match("/[aeiou]/i",$letras)) {
        throw new Exception (" Letras de la matricula incorrecte");
    } else echo " $letras Letras correctas";
}

matricula(1111,"HYT");
?>
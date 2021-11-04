<?php

$num1 = rand(1,1000);
$num2 = rand(0,100);

if($num2==0){
    echo "No se puede dividir con 0";
}
else $res=round($num1/$num2);

echo "El resultado es " . $res;
?>
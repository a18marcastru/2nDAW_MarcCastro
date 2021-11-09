<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<title>ACT1.5</title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<meta name="generator" content="Geany 1.36" />
</head>

<body>
	


<?php

/* 1-. Implementa un script que simuli una calculadora

    El cos principal calcularà un enter aleatori entre 1 i 5.

    Segons el número es cridarà a la funció corresponent per realitzar les operacions 1->suma, 2->resta, 3->producte, 4->divisió i 5->arrel quadrada.

    Dins de cada funció es calcularan aleatòriament els operands de l'operació.

    La funció farà el càlcul corresponent i tornarà el resultat al cos principal. En el cas de la divisió també el residu.

    El cos principal mostrarà al navegador tota la informació de l'operació realitzada.*/


// crida a la funció segons el random

 switch(rand(1,5)){

		case 1:
			mostrar(suma());
			break;
		case 2:
			mostrar(resta());
			break;
		case 3:
			mostrar(producte());
			break;
		case 4:
			mostrar(divisio());
			break;
		case 5:
			mostrar(arrelq());
			break;
		}

  function suma(){

	  		$operacio = "sumar";

			$num1 = rand(-1000,1000);
			$num2 = rand(-1000,1000);

			$result = $num1 + $num2;

			return array($operacio, $num1, $num2, $result);

		}

function resta(){

	$operacio = "restar";

		$num1 = rand(-1000,1000);
		$num2 = rand(-1000,1000);

		$result = $num1 - $num2;

		return array($operacio, $num1, $num2, $result);
		}

function producte(){

		$operacio = "multiplicar";

		$num1 = rand(-1000,1000);
		$num2 = rand(-1000,1000);

		$result = $num1 * $num2;

		return array($operacio, $num1, $num2, $result);
		}


function divisio(){

		$operacio = "dividir";

		$num1 = rand(-1000,1000);
		$num2 = rand(-1000,1000);

		$result = round($num1 / $num2,2);
		$residu = $num1 % $num2;

		return array($operacio, $num1, $num2, $result, $residu);

		}

function arrelq(){

			$operacio = "arrel quadrada";

			$num1 = rand(1,1000);
			$result = round(sqrt($num1),2);

		return array($operacio, $num1, $result);
		}



function mostrar($result) {

	if (count($result) == 4) {
		echo "Has demanat " . $result[0] . " " . $result[1] . " i " . $result[2] . " . El resultat és: " . $result[3];

		} elseif (count($result) == 3) {
			echo "Has demanat realitzar l'". $result[0] . " de " . $result[1] . " . El resultat és: " . $result[2];
			} else {
				echo "Has demanat " . $result[0] . " " . $result[1] . " entre " . $result[2] . " . El resultat és: " . $result[3]
				. " i el residu " . $result[4];
				}



	}


?>



<?php


/*Implementa un script que al cos principal i de manera aleatòria, calculi la funció que cridarà:

    Si surt 1: Funció que donat un número indeterminat d’enters, retorni el resultat de la suma així com la quantitat de nombres sumats.
    Si surt 2: Funció que calculi el perímetre d’un quadrat
    Si surt 3: Funció que donada una quantitat de diners, i un tipus de moneda, retorni la quantitat de monedes del tipus donat que conté la quantitat i els diners que sobren

NOTA: Els operadors es calcularan al cos ppal i es passaran per paràmetre*/


switch(rand(1,3)){

		case 1:
			//paràmetre: l'array de sumands

			$sumands = rand(1,10);
			for ($i=0;$i<$sumands;$i++){
				$nums[$i] = rand(-1000,1000);
				};
			//print_r($nums);
			$suma=sumar($nums);
			echo " Has sumat ". $sumands . " valors. El resultat de la suma és : ". $suma;
			break;
		case 2:
			// paràmetre: costat del quadrat
			$costat = rand(1,10);
			echo "El perímetre del quadrat de costat " . $costat . " és: " . perimetre($costat) . " . " ;
			break;

		case 3:
			// paràmetres: quantitat de diners i moneda de càlcul
			$monedes = array(0.01,0.05,0.1,0.2,0.5,1,2);
			$moneda = $monedes[rand(0,6)];
			$diners = rand(1,1000);
			$result = monedes($diners,$moneda);
			//print_r($result);
			echo "A " . $diners . " hi ha " . $result[0] . " monedes de " . $moneda . " i en sobren " . round($result[1],2) . " diners ";
			break;
		}

function sumar($nums) {


	for ($i=0;$i<count($nums);$i++) $suma += $nums[$i];
	return $suma;

	};

function perimetre($costat) {

	return $costat * 4;

	};



function monedes($diners, $moneda) {


	$nummonedes = 0;
	$queden = $diners;
	while($queden >= $moneda){
				$queden -= $moneda;
				$nummonedes++;
			}
	return array($nummonedes,$queden);
	};


?>

<?php
//3-. Escriu una funció que comprovi el format correcte de la matrícula d'un cotxe ( xxxx, on 0<=x<=9 i yyy, on y és una consonant).
//Tracta amb excepcions el cas que no sigui correcte. Dissenya i executa el joc de proves que consideris adient.


function matricula($num,$lletres){

    try {

        num_mat($num);
        lletres_mat($lletres);

    } catch(Exception $e) {

        echo "Matrícula incorrecta. ";
    } };

    function num_mat($numMat){
        echo $numMat;
        if ($numMat < 0 or $numMat > 9999) {
            throw new Exception ("Número de la matrícula incorrecte");
        } else {
            echo "nombre correcte";
        }

    };

    function lletres_mat($lletres){
        if ( strlen($lletres) <> 3 or
            preg_match("/[0-9]/",$lletres) or
            preg_match("/[aeiou]/i",$lletres)) {
                throw new Exception ("Lletres de la matrícula incorrecte");
        } else echo "Lletres correctes";

    }
    //Crida a la funció de comprovació
    matricula(1111,"BBo");

?>
</body>

</html>

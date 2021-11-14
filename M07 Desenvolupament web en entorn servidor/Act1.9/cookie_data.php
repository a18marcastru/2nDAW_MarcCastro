<?php
$datahora = "Aquest és el primer accés";
$contador = 1;
date_default_timezone_set('Europe/Madrid');
if (isset($_COOKIE['datahora'])){
    $datahora = $_COOKIE['datahora'];
    $contador = $_COOKIE['contador'];
}
setcookie("datahora",date('d/m/Y H:i:s')); // actualiza la cookie
setcookie("contador",$contador + 1); // actualiza la cookie
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookie data</title>
</head>
<body>
    <center>
        <?php
            echo "<h3>Data i hora actual: ". date('d/m/Y H:i:s') . "</h3><br><b>";
            echo "<br>L'última vegada que vas accedir a aquesta pàgina va ser: $datahora <br>";
            echo "<br>Quantitat d'accesos a aquesta pàgina: $contador <br>";
        ?>
        <br>
        <a href="cookie_data.php">Actualitzar</a> | <a href="esborrar_cookie_data.php">Eliminar</a>
    </center>
</body>
</html>
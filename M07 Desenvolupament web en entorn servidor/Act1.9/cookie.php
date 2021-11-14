<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookie nombre</title>
</head>
<body>

<?php
    if(!$_POST){
?>
    <form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="post">
        <input type="text" name="nomusu" value="">
        <input type="submit" name="submit" value="Submit">
    </form>
    <a href="esborrar_cookie.php">Eliminar cookie</a>

<?php
    }
    else {
        if (isset($_COOKIE['nomusu'])){
            $nomusu = $_COOKIE['nomusu'];
            echo " Benvingut " . $nomusu . "<br>";
            echo "<a href='javascript:history.go(-1)'>Tornar</a>";
        }
        else {
            setcookie("nomusu",$_POST["nomusu"]);
            echo "Acabo d'arribar i el servidor no sap com em dic" . "<br>";
            echo "<a href='javascript:history.go(-1)'>Tornar</a>";
        }
    }
?>

</body>
</html>



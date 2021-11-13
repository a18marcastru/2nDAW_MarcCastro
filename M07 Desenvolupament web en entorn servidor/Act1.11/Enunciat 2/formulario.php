<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulari</title>
</head>
<body>
<?php
    if(!$_POST){
        $nameErr = "";
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            if (empty($_POST["nombre"])) {
                $nameErr = "Name is required";
            }
        }
        function test_input($valor){
            $valor = trim($valor);
            $valor = stripslashes($valor);
            $valor = htmlspecialchars($valor);
            return $valor;
        }
?>
    <center>
        <h1>Formulari per demanar consulta al professor</h1>
    </center>
    <div>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <fieldset>
                <legend>Demanda de consulta</legend>
                <label for="nombre">El teu nom:
                    <input type="text" name="nombre" id="nombre">
                    <?php echo $nameErr;?>
                </label>
                <br><br>
                <label for="consulta">Tipus de consulta:
                    <input type="radio" id="rapido" name="opciones" value="Ràpido">
                    <label for="rapido">Ràpido</label>
                    <input type="radio" id="normal" name="opciones" value="Normal">
                    <label for="normal">Normal</label>
                    <input type="radio" id="llarga" name="opciones" value="Llarga">
                    <label for="llarga">Llarga</label>
                </label>
                <br><br>
                <button type="submit" name="enviar" value="Sumbit">Enviar</button>
                <button type="reset" name="borrar" value="Borrar">Borrar</button>
            </fieldset>
        </form>
    </div>
<?php
    }
    else {
        echo "<center>";
        echo "<h1>Fue enviado el formulario</h1>";
        echo "</center>";

        if(isset($_POST["nombre"])){
            $nombre = $_POST["nombre"];
            $opciones = $_POST["opciones"];
        }

        $fh = fopen("consultes.txt", "a+") or die("Se produjo un error al crear el archivo");

        $texto = <<<_END
Consulta:
---------
Nombre: $nombre
Tipo de consulta: $_POST[opciones]
\n
_END;
        fwrite($fh, $texto);
        fclose($fh);
    }
?>
</body>
</html>
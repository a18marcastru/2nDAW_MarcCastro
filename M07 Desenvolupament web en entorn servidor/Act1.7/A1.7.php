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
        // define variables and set to empty values
        $Model = $Marca = $Motor = $Cilindrada = $Energia = $Opcions = "";

        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $Model = test_input($_POST["Model"]);
            $Marca = test_input($_POST["Marca"]);
            $Motor = test_input($_POST["Motor"]);
            $Cilindrada = test_input($_POST["Cilindrada"]);
            $Energia = test_input($_POST["Energia"]);
            $Opcions = test_input($_POST["Opcions"]);
        }

        function test_input($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }
        ?>
        <h1> Formulari i resposta</h1>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            Model: <input type="text" name="Model">
            <br><br>
            Marca: <input type="text" name="Marca">
            <br><br>
            Motor: <input type="text" name="Motor">
            Cilindrada: <input type="text" name="Cilindrada">
            <br><br>
            Energia:
            <input type="radio" name="Energia" value="Gasolina">Gasolina
            <input type="radio" name="Energia" value="Diesel">Diesel
            <input type="radio" name="Energia" value="Híbrid">Híbrid
            <input type="radio" name="Energia" value="Elèctric">Elèctric
            <br><br>
            <label for="Opcions">Opcions: </label>
            <select id="Opcions" name="Opcions" size="4">
                <option value="Pack Sport">Pack Sport</option>
                <option value="Millora seguretat">Millora seguretat</option>
                <option value="Climatitzador">Climatitzador</option>
                <option value="Ordinador a bord">Ordinador a bord</option>
            </select>
            <br><br>
            <input type="submit" name="submit" value="Envia">
            <input type="reset" name="reset" value="Inicialitza">
        </form>

        <?php
        echo "<h2>Your Input:</h2>";
        echo $Model;
        echo "<br>";
        echo $Marca;
        echo "<br>";
        echo $Motor;
        echo "<br>";
        echo $Cilindrada;
        echo "<br>";
        echo $Energia;
        echo "<br>";
        echo $Opcions;
        echo "<br>";
        ?>
    </body>
</html>
<!DOCTYPE HTML>
<html>
<head>
    <style>
        .error {color: #FF0000;}
    </style>
</head>
<body>

<?php

$nameErr = $emailErr = $fechaErr = $telefonoErr = $genderErr = $idiomas_parErr = $idiomas_aprErr = $temasErr = "";
$name = $email = $fecha = $telefono = $gender = $idiomas_par = $idiomas_apr = $temas = $comment = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["name"])) {
        $nameErr = "Name is required";
    } else {
        $name = test_input($_POST["name"]);
        if (!preg_match("/^[A-Za-zƒŠŒŽšœžŸÀÁÂÃÄÅÆÇÈÉÊ ËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]*$/",$name)) {
            $nameErr = "Only letters and white space allowed";
        }
    }

    if (empty($_POST["email"])) {
        $emailErr = "Email is required";
    } else {
        $email = test_input($_POST["email"]);
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "Invalid email format";
        }
    }

    if (empty($_POST["fecha"])) {
        $fechaErr = "fecha is required";
    } else {
        $fecha = test_input($_POST["fecha"]);
    }

    if (empty($_POST["telefono"])) {
        $telefonoErr = "Telefono is required";
    } else {
        $telefono = test_input($_POST["telefono"]);
        if (!preg_match('/^[967]\d{8}$/', $telefono)){
            $telefonoErr = "El teléfono tiene 9 cifras y empieza por 9, 6 o 7";
        }
    }

    if (empty($_POST["idiomas_par"])) {
        $idiomas_parErr = "Idiomas de hablar is required";
    } else {
        $idiomas_par = test_input($_POST["idiomas_par"]);
    }

    if (empty($_POST["idiomas_apr"])) {
        $idiomas_aprErr = "Idiomas de aprender is required";
    } else {
        $idiomas_apr = test_input($_POST["idiomas_apr"]);
    }

    if (empty($_POST["temas"])) {
        $temasErr = "Temas is required";
    } else {
        $temas = test_input($_POST["temas"]);
    }

    if (empty($_POST["gender"])) {
        $genderErr = "Gender is required";
    } else {
        $gender = test_input($_POST["gender"]);
    }
}

function test_input($data) {
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}
?>

<h2>Formulario de suscripcion</h2>
<p><span class="error">* required field</span></p>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    Nombre completo: <input type="text" name="name">
    <span class="error">* <?php echo $nameErr;?></span>
    <br><br>
    E-mail: <input type="text" name="email">
    <span class="error">* <?php echo $emailErr;?></span>
    <br><br>
    Fecha nacimiento: <input type="date" name="fecha">
    <span class="error">* <?php echo $fechaErr;?></span>
    <br><br>
    Telefono: <input type="text" name="telefono">
    <span class="error">* <?php echo $telefonoErr;?></span>
    <br><br>
    Genero:
    <input type="radio" name="gender" value="female">Female
    <input type="radio" name="gender" value="male">Male
    <input type="radio" name="gender" value="other">Other
    <span class="error">* <?php echo $genderErr;?></span>
    <br><br>
    <label for="idiomas_par">Idiomas que hablas: </label>
    <select id="idiomas_par" name="idiomas_par" size="3" multiple>
        <option value="Español">Español</option>
        <option value="Catalan">Catalan</option>
        <option value="Ingles">Ingles</option>
        <option value="Aleman">Aleman</option>
    </select>
    <span class="error">* <?php echo $idiomas_parErr;?></span>
    <br><br>
    Idioma que aprender: <input type="text" name="idiomas_apr">
    <span class="error">* <?php echo $idiomas_aprErr;?></span>
    <br><br>
    <label for="temas">Temas: </label>
    <select id="temas" name="temas" size="4" multiple>
        <option value="programacion">Programacion</option>
        <option value="diseñador">Diseñador</option>
        <option value="ingeniero">Ingeniero</option>
        <option value="ciberseguridad">Ciberseguridad</option>
    </select>
    <span class="error">* <?php echo $temasErr;?></span>
    <br><br>
    Comment: <textarea name="comment" rows="5" cols="40"></textarea>
    <br><br>
    <input type="submit" name="submit" value="Submit">
    <input type="reset" name="reset" value="Inicialitza">
</form>

<?php
    echo "<h2>Your Input:</h2>";
    echo $name;
    echo "<br>";
    echo $email;
    echo "<br>";
    echo $fecha;
    echo "<br>";
    echo $telefono;
    echo "<br>";
    echo $gender;
    echo "<br>";
    echo $idiomas_apr;
    echo "<br>";
    echo $idiomas_par;
    echo "<br>";
    echo $temas;
    echo "<br>";
    echo $comment;
?>
</body>
</html>
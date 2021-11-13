<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subir fichero</title>
</head>
<body>
    <h2>Escriure missatge</h2>
    <form method="post" action="fichero.php" enctype="multipart/form-data">
        Text del Missatge:
        <br>
        <textarea name="comment" rows="5" cols="40"></textarea>
        <br><br>
        <label for="fichero">Fitxer a adjuntar:
            <input type="file" name="fichero"/>
        </label>
        <br><br>
        <button type="submit" name="enviar" value="Sumbit">Enviar dades</button>
    </form>
</body>
</html>

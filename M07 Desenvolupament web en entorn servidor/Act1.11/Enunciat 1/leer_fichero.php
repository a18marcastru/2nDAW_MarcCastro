<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Leer fichero</title>
</head>
<body>
    <?php
        echo "<pre>";
        echo file_get_contents("CurriculumCCFF.txt");
        echo "</pre>";
    ?>
</body>
</html>
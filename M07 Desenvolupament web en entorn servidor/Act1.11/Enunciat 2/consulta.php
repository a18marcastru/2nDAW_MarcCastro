<?php
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
?>
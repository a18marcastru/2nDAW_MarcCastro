<?php
    echo "<h2>Caracteristicas del archivo</h2>";
    echo "- El nombre del archivo ".$_FILES["fichero"]["name"];
    echo "<br>";
    echo "- El tipo de archivo ".$_FILES["fichero"]["type"];
    echo "<br>";
    echo "- El tamaño del archivo ".$_FILES["fichero"]["size"]."KB";
    echo "<br>";

    echo "<br><br>";
    $servidor = "../Enunciat 3/".basename($_FILES["fichero"]["name"]);
    if(move_uploaded_file($_FILES['fichero']['tmp_name'],$servidor)){
        echo "El archivo ". basename($_FILES["fichero"]["name"]." ha sido subido.");
    }
    else echo "El archivo no se ha subido correctamente.";
?>

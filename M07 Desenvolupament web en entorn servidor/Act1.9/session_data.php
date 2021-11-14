<?php
session_start();
$datahora = "Aquest és el primer accés";
$contador = 1;
date_default_timezone_set('Europe/Madrid');
if (isset($_SESSION['datahora'])){
    $datahora = $_SESSION['datahora'];
    $contador = $_SESSION['contador'];
}
$_SESSION["datahora"] = date('d/m/Y H:i:s');
$_SESSION["contador"] = $contador + 1;
?>
<html>
<head>
    <title>Session data</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <meta name="generator" content="Geany 1.25" />
</head>
<body>
<center>
    <?php
        echo "<h3>Data i hora actual: ". date('d/m/Y H:i:s') . "</h3><b>";
        echo "<br>L'última vegada que vas accedir a aquesta pàgina va ser: $datahora <br>";
        echo "<br>Quantitat d'accesos a aquesta pàgina: $contador <br></b>";
    ?>
    <pre><a href="session_data.php">Actualitzar</a> | <a href="esborrar_session_data.php">Eliminar</a></pre>
</center>
</body>
</html>

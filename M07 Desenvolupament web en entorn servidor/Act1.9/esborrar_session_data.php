<?php
session_start();
unset($_SESSION['contador']);
unset($_SESSION['datahora']);
?>
<html>
<head>
    <title>Eliminar session data</title>
</head>
<body>
    <center>
        <h2>Session data</h2><br><br>
        <p>Variables de la sesió <b><?php echo session_id() ?></b>
            amb nom <b><?php echo session_name() ?></b> actualitzades.<br>
            <a href="session_data.php">tornar</a></p>
    </center>
</body>
</html>
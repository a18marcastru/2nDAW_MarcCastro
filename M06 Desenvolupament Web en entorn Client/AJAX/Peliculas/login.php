<?php
    $username = $_POST['username'];
    $password = $_POST['password'];
    $timer = rand(1,7);
    sleep($timer);
    if(($username == 'user') && ($password == '1234')) {
        session_start();
        $arr = array('exito'=>true,'nombre'=>"Marc Castro",'imagen'=>'https://randomuser.me/api/portraits/men/23.jpg');
    }
    else {
        $arr = array('exito'=>false);
    }

    $myJSON = json_encode($arr);
    echo $myJSON;
?>
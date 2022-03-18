<?php
    session_start();
    session_destroy();
    $sesion = 'cerrada';
    header('Location:login.php?sesion='.$sesion);
?>
<?php
session_start();
if(isset($_GET['sesion']) == 'cerrada'):
    echo '<h1>Sesión cerrada</h1>';
endif;
if(isset($_SESSION['sesion']) == true):
    header('location:home.php');
endif;
if(isset($_GET['registro']) == 'completado'):
    echo '<h1>Registro completado</h1>';
endif;
?>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="./styles/style.css">
        <meta lang="es-es" charset="utf-8">
    </head>
    <body>
        <form action="./home.php" method="POST">
            <div class="form__">
                <h1>Inicio de sesión</h1>
                <div class="form__input"><input type="text" name="usuario" placeholder="Ingresa tu usuario"></div>
                <div class="form__input"><input type="password" name="password" placeholder="Ingresa tu contraseña"></div>
                <div class="form__input"><input type="submit" value="enviar"></div>
                <div class="form__input"><a href="./register.php">Registrate aquí</a></div>
            </div>
        </form>
    </body>
</html>
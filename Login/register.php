<?php
    //Variables
    if(!empty($_POST)){
        $usuario = $_POST['usuario'];
        $passwordpost = md5($_POST['password']);
        $email = $_POST['email'];
        $imagen = $_POST['imagen'];
        $query = "INSERT INTO usuarios (id, nombre, password, email, imagen) VALUES (null,'$usuario','$passwordpost','$email','$imagen')";
    }
    //

    //conexión a base de datos
    $servername = "localhost";
    $database = "login";
    $username = "root";
    $password = "1234";
    $conn = mysqli_connect($servername, $username, $password, $database);
    
    //
   
    //Escribir usuarios en la base de datos
    if(!empty($_POST)){
        mysqli_query($conn, $query);
        $registro = 'completado';
        sleep(2);
        header('Location:login.php?registro='.$registro);
    };
    //
    //Subir el fichero
    //move_uploaded_file($_FILES['imagen']['tmp_name'], 'E:\xamp\htdocs\Login\imagenes');
    //var_dump($_FILES['imagen']); 
?>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="./styles/style.css">
        <meta lang="es-es" charset="utf-8">
    </head>
    <body>
        <form action="./register.php" method="POST">
            <div class="form__">
                <h1>Registro</h1>
                <div class="form__input"><input type="text" name="usuario" placeholder="Ingresa tu usuario" required></div>
                <div class="form__input"><input type="password" name="password" placeholder="Ingresa tu contraseña" required></div>
                <div class="form__input"><input type="email" name="email" placeholder="Ingresa tu email" required></div>
                <div class="form__input"><input type="file" name="imagen" accept="image/png, image/jpeg"></div>
                <div class="form__input"><input type="submit" value="enviar"></div>
            </div>
        </form>
    </body>
</html>

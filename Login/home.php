<link rel="stylesheet" type="text/css" href="./styles/style.css">
<?php
    session_start();
    //conexión a base de datos
    $servername = "localhost";
    $database = "login";
    $username = "root";
    $password = "1234";
    $conn = mysqli_connect($servername, $username, $password, $database);
    //

    //Validación de usuario
    $query = mysqli_query($conn,'SELECT * FROM usuarios');
    if(!isset($_SESSION['sesion'])){
        while($row = mysqli_fetch_assoc($query)){
            if( $_POST['usuario'] == $row['nombre'] && 
            md5($_POST['password']) == $row['password']){
                    $_SESSION['sesion'] = true;
                    $_SESSION['usuario'] = $row['nombre'];
                    $_SESSION['password'] = $row['password'];
                    $_SESSION['email'] = $row['email'];
                    if($row['imagen'] != null){
                        $_SESSION['imagen'] = $row['imagen'];
                    }else{
                        $_SESSION['imagen'] = './imagenes/custom.png';
                    }
                    echo '<h1>Se ha iniciado correctamente en la base de datos</h1>';
            };
            /*DEBUG  
            var_dump($row['nombre']);
            var_dump($row['password']);
            var_dump($row['email']);
            */
        };
    };
    if(!$_SESSION['sesion']){
        header('Location:./login.php');
    }
    //

if(isset($_SESSION['sesion']) == true){
    echo '<div class="card"><img src="'.$_SESSION['imagen'].'"></div>';
    echo 'Usuario: '.$_SESSION['usuario'].'<br>'; 
    echo 'Contraseña: '.$_SESSION['password'].'<br>';
    echo 'email: '.$_SESSION['email'].'<br>';

    echo '<a href=./logout.php>Cerrar sesión</a>';
}; ?>

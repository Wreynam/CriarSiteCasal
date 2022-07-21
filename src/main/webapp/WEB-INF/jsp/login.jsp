<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>Citigames - Login</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" href="css/register-login.css">

    <script src="bootstrap/bootstrap-5.1.3-dist/js/bootstrap.js"></script>
    
</head>
<body>
    <div class="center">
        <div class="container">
            <label for="show" class="close-btn fas fa-times" title="close"></label>
            <div class="text">
               	Logar
                <p style="
					width: auto;
					height: auto;
					border-radius: 10px;
					background-color: red;
					opacity: 90%;
					color: black;
					font-size: 60%;">${msg}</p>
            </div>
            <form action="logar" method="post">
                <div class="data">
                    <label>Email</label>
                    <input type="text" name="email" required>
                </div>
                <div class="data">
                    <label>Password</label>
                    <input type="password" min="8" name="senha" required>
                </div>
                <div class="remember" >
                 	<p><input type="checkbox"> Remember-me</p>
                </div>
                <div class="forgot-pass">
                    <a href="entrada?acao=recuperarSenha">Forgot Password?</a>
                </div>
                <div class="btn">
                    <button type="submit">Login</button>
                </div>
                <div class="signup-link">
                    Not a member? <a href="entrada?acao=registrar">Signup now</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html> 
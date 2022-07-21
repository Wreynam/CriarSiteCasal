<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register-login.css">
</head>
<body>
<div class="center">
        <div class="container">
            <label for="show" class="close-btn fas fa-times" title="close"></label>
            <div class="text">
                Registrar-se
                <p style="
							width: auto;
							height: auto;
							border-radius: 10px;
							background-color: red;
							opacity: 90%;
							color: black;
							font-size: 60%;">${msg}</p>
            </div>
            <form action="registrarUsuario" method="post" accept-charset="ISO-8859-1" >
                <div class="data">
                    <label>Nome</label>
                    <input type="text" name="nome"required>
                </div>
                <div class="data">
                    <label>Email</label>
                    <input type="email" name="email" required>
                </div>
                <div class="data">
                    <label>Password</label>
                    <input type="password" min="8" name="senha" required>
                </div>
                
                <div class="btn">
                    <div class="inner"></div>
                    <button type="submit">Quero criar meu site</button>
                </div>
                 <div class="signup-link">
                    Is a member? <a href="entrada">Login</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
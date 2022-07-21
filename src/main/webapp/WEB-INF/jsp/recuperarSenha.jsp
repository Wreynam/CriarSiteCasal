<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
</head>
<body style="display: flex; align-items: center; justify-content: center; background-color: grey;">

<form class="formulario" action="recuperarSenha" method="post" style="width: 40%; margin-top: 100px; padding: 15px; background-color: white; border-radius: 15px; display:flex; flex-direction:column; align-items: center;">
	<label class="form-label" >Recuperar Senha</label>
	<div class="mb-3" style="width: 90%;">
	  <label for="exampleFormControlInput1" class="form-label">Nome Cadastrado</label>
	  <input type="text" class="form-control" id="exampleFormControlInput1" name="nome" placeholder="nome">
	</div>
	<div class="mb-3" style="width: 90%;">
	  <label for="exampleFormControlInput1" class="form-label">Email address</label>
	  <input type="email" class="form-control" id="exampleFormControlInput1" name="email" placeholder="name@example.com">
	</div>
	<button type="submit" class="btn btn-primary">Recuperar</button>
</form>
<script src="bootstrap/bootstrap-5.1.3-dist/js/bootstrap.js"></script>
</body>
</html>
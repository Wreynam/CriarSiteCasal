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

<form class="formulario" action="recSenhaNova" method="post" style="width: 40%; margin-top: 100px; padding: 15px; background-color: white; border-radius: 15px; display:flex; flex-direction:column; align-items: center;">
	<label class="form-label" >Digite a nova senha</label>
	<input type="password" class="form-control" value="${ID}" name="ID" id="exampleFormControlInput1" hidden="true">
	<div class="mb-3" style="width: 90%;">
	  <label for="exampleFormControlInput1" class="form-label">Nova senha</label>
	  <input type="password" class="form-control" name="novaSenha" id="exampleFormControlInput1" placeholder="Nova Senha">
	</div>
	<div class="mb-3" style="width: 90%;">
	  <label for="exampleFormControlInput1" class="form-label">Confirmar nova senha</label>
	  <input type="password" class="form-control" name="novaSenhaConfirmar" id="exampleFormControlInput1" placeholder="Nova Senha">
	</div>
	<button type="submit" class="btn btn-primary">Confirmar</button>
</form>
<script src="bootstrap/bootstrap-5.1.3-dist/js/bootstrap.js"></script>
</body>
</html>
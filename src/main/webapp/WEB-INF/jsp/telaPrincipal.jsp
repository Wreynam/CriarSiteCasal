<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="css/telaPrincipal.css">
</head>
<body>
<body bgcolor="#E6E6FA">
  <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a onclick="exibir(1)" href="javascript:void(0)" style="color: white;">Sua Conta</a>
  <a onclick="exibir(2)" href="javascript:void(0)" style="color: white;">Informações do Casal</a>
  <a onclick="exibir(3)" href="javascript:void(0)" style="color: white;">Sair</a>
</div>
<span onclick="openNav()"><img src="imagens/menu-alt-512.webp" width="40px" style=" margin-left: 20px; margin-top: 20px;"></span>

<div id="main">
</div>
<form action="atualizarCadastroConta" method="post" class="formulario" id="suaConta" >
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Nome completo</label>
	  <input type="text" class="form-control" value="${conta.getNome()}" name="nome" id="exampleFormControlInput1" placeholder="Nome" required>
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">E-mail</label>
	  <input type="email" class="form-control" value="${conta.getEmail()}" name="email" id="exampleFormControlInput1" placeholder="name@example.com" required>
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Telefone</label>
	  <input type="tel" class="form-control" value="${conta.getTelefone()}" name="telefone" id="exampleFormControlInput1" placeholder="(12) 11234-5678" required>
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlTextarea1" class="form-label">Um pouco sobre você</label>
	  <textarea class="form-control"  id="exampleFormControlTextarea1" name="sobre" rows="3" required>${conta.getSobre()}</textarea>
	</div>
	<div class="mb-3">
		<label for="exampleFormControlTextarea1" class="form-label">Foto</label>
  		<input type="file" class="form-control" id="inputGroupFile02">
	</div>
	<div>
		<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" >Alterar Senha</button>
		<button type="submit" class="btn btn-success">Salvar</button>
	</div>
</form>

<form action="atualizarCadastroInfoConta" class="formulario" method="post" id="infoCasal" style="display: none;">
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Nome do Casal</label>
	  <input type="text" class="form-control" value="${infoConta.getNomeCasal()}" name="nomeCasal" id="exampleFormControlInput1" placeholder="Nome">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Data do Casamento</label>
	  <input type="date" class="form-control" value="${infoConta.getDataCasamento()}" name="dataCasamento" id="exampleFormControlInput1" placeholder="12/12/2012">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Cidade</label>
	  <input type="text" class="form-control" value="${infoConta.getCidade()}" name="cidade" id="exampleFormControlInput1" placeholder="Cidade">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlTextarea1" class="form-label">Estado</label>
	  <input type="text" class="form-control" value="${infoConta.getEstado()}" name="estado" id="exampleFormControlInput1" placeholder="Estado">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlTextarea1" class="form-label">Endereço de Acesso</label>
	  <input type="text" class="form-control" value="${infoConta.getEnderecoAcesso()}" name="enderecoAcesso" id="exampleFormControlInput1" placeholder="Seu Site">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlTextarea1" class="form-label">Um pouco sobre o casal</label>
	  <textarea class="form-control" name="sobreCasal" id="exampleFormControlTextarea1" rows="3">${infoConta.getTextoDescritivo()}</textarea>
	</div>
	<div class="mb-3">
		<label for="exampleFormControlTextarea1" class="form-label">Foto</label>
  		<input type="file" class="form-control" id="inputGroupFile02">
	</div>
	<div>
		<button type="submit" class="btn btn-success">Salvar</button>
	</div>
</form>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Alterar senha</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <form id="form-alterar-senha" action="novaSenha" method="post">
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Senha Atual</label>
            <input type="text" class="form-control" id="recipient-name" name="senhaAtual">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Nova Senha</label>
            <input type="password" class="form-control" id="recipient-name" name="novaSenha">
          </div>
          <div class="mb-3">
            <label for="recipient-name" class="col-form-label">Confirmar Nova Senha</label>
            <input type="password" class="form-control" id="recipient-name" name="novaSenhaConfirmar">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary" form="form-alterar-senha">Alterar</button>
      </div>
    </div>
  </div>
</div>
<script src="bootstrap/js/bootstrap.js"></script>
<script src="js/telaPrincipal.js"></script>
</body>
</html>
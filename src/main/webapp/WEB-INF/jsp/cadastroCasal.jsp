<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register-login.css">
<link rel="stylesheet" href="css/infoCasal.css">
</head>
<body>
        <div class="container casal">
            <label for="show" class="close-btn fas fa-times" title="close"></label>
            <div class="text">
                Informações do Casal
            </div>
            <form action="primeiroCadastro" method="post" accept-charset="ISO-8859-1" >
            	<div class="infoCasal" >
	            	<div class="data primeiro">
	                    <label>Nome do seu Amor</label>
	                    <input type="text" name="nomeAmor" required>
	                </div>
	                <div class="data">
	                	<label>Email do seu amor</label>
	                    <input type="email" name="emailAmor" required>
	                </div>
            	</div>
            	<div class="text">
                	Informações da Conta
            	</div>
            	<div class="infoCasal">
	            	<div class="data primeiro">
		                  <label>Dado do Casamento</label>
		                  <input type="date" name="dataCasamento" required>
		             </div>
		             <div class="data">
		                  <label>Endereço site</label>
		                  <input type="text" name="acessoSite" required>
		             </div>
            	</div>
                <div class="btn">
                    <button type="submit">Continuar</button>
                </div>
            </form>
        </div>

</body>
</html>
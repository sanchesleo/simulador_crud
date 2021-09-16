<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Usuario</title>
</head>
<body>

	<form action="/simuladorCRUD/alteraUsuario"  method="post">
		<label>Usuario</label> <br>
		<input type=text name="nome" value="${usuario.nome}"><br>  
		<label>Senha</label> <br>
		<input type=password name="senha" value="${usuario.senha}"><br>  
		<label>Email</label><br> 
		<input type=text name="email" value="${usuario.email}"><br>
		<label>Telefone</label><br> 
		<input type=text name="telefone" value="${usuario.telefone}"><br> 
		<input type="hidden" name="id" value="${usuario.id}"><br> 
		<input type=submit name="enviar">
	</form>


</body>
</html>
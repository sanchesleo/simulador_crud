<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="control.*, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usu�rios</title>
</head>
<body>

	<c:if test="${not empty usuario}">
		Usu�rio ${usuarios.nome} cadastrado com sucesso!
	</c:if>

	Lista de usu�rios cadastrados:

	<ol>
		<c:forEach items="${usuarios}" var="usuario">
			<li>${usuario.nome} - ${usuario.email} - <fmt:formatDate value="${usuario.dataCadastro}" /> 
			<a href="/simuladorCRUD/removeUsuario?id=${usuario.id}">remover</a> 
			<a href="/simuladorCRUD/mostraUsuario?id=${usuario.id}">editar</a>
			</li>
		</c:forEach>
	</ol>

</body>
</html>
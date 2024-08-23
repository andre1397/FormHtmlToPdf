<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
*{
	text-align: center;
	padding: 1em;
}
input{
	margin-top: 2em;
}
</style>

<title>Menu</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<form action="consultarUsuarios" method="post">
		<input type="submit" value="Consultar Usuários" style="margin-top: 10%">
	</form>
	<br>
	<br>
	<a href="newUser.jsp"><input type="button" value="Criar novo usuário" style="margin-top: -1em"></a>
	<br>
	<br>
	<form action="Formulario" method="get">
		<input type="submit" name="irFormulario" value="Ir para o formulário" style="margin-top: 0.5em">
	</form>
	<br>
	<br>
	<a href="index.jsp"><input type="button" value="Desconectar"></a>
</body>
</html>
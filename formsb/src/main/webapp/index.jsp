<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
*{
	text-align:center;
}
img{
	height: 200px;
	widht: 200px;
}
</style>
<meta charset="UTF-8">
<title>Login</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<img alt="" src="imagens/logo.jpeg">
	<h1 style="margin-top: 1%">Realizar Login no Sistema</h1>
	<form action="fazerLogin" method="post" id="formLogin">
		<label style="margin-left:1em;">E-mail: </label><input type="email" name="email">
		<br>
		<br>
		<label>Password: </label><input type="password" name="senha">
		<br>
		<br>
		<input type="submit" value="Login">
	</form>
	<br>
	<div>
		<%
		String mensagem = (String) request.getAttribute("mensagem");
		if (mensagem != null){
			out.print(mensagem);
		}
		%>
	</div>
</body>
</html>
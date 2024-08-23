<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário Enviado</title>
<link rel="icon" href="imagens/favicon.jpeg">
<style type="text/css">
*{
	text-align: center;
}
</style>
</head>
<body>
	<h1>Formulário enviado com sucesso!</h1>
	<br>
	<form action="formEnviado" method="get">
	<%
		String voltarMenu = (String) request.getParameter("voltarMenu");
		if (voltarMenu!=null){
			out.print("<input type=\"hidden\" name=\"voltarMenu\" value=\"voltarMenu\">");
		}
	%>
		<input type="submit" name="voltarForm" value="Preencher outro formulário">
		<br>
		<br>
		<input type="submit" name="desconectar" value="Desconectar">
	</form>
</body>
</html>
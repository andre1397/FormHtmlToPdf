<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
*{
	text-align:center;
}
input{
	font-size: x-large;
	margin: 10px;
}
</style>

<title>Excluir Usuário</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<%
	String email = (String) request.getParameter("email");
	%>
	<h1>Você deseja excluir o usuário <%=email%> ?</h1>
	
	<form action="modificarUsuario" method="post">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="submit" name="excluirSim" value="Sim">
		<input type="submit" name="excluirNao" value="Não">
	</form>
</body>
</html>
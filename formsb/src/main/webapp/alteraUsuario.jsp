<%@ page import="br.com.sb.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	*{
		text-align: center;
	}
	#adm{
		vertical-align: middle;
		margin-right: 2.3em;
	}
</style>
<meta charset="UTF-8">
<title>Alterar Usuário</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<h1>Alterar Usuário</h1>
	<form action="alterarUsuario" method="post">
		<%
		if (request.getAttribute("usuario") != null){
			User usuario = (User) request.getAttribute("usuario");
		%>
		<h2><%out.print(usuario.getEmail());%></h2>
		<input type="hidden" name="email" value="<%out.print(usuario.getEmail());%>">
		<label>Nome: </label><input type="text" name="novoNome" value="<%out.print(usuario.getName());%>">
		<input type="hidden" name="nomeOriginal" value="<%out.print(usuario.getName());%>">
		<br><br>
		<label>Possui permissão para criar usuários: </label>
		<input type="checkbox" name="adm" <%if (usuario.getAdm() == 1){
				out.print("checked");
			}%>>
		<br><br>
		<label>Recebe Formulário: </label>
		<input type="checkbox" name="recebeForm" <%if (usuario.getRecebeForm() == 1){
				out.print("checked");
			}%>>
		<br><br>
		<label>Senha: </label><input type="password" name="novaSenha">
		<input type="hidden" name="senhaOriginal" value="<%out.print(usuario.getPassword());%>">
		<br><br>
		<label>Repita a senha: </label><input type="password" name="novaSenhaRepetida" style="margin-right: 4em">
		<br><br>
		<input type="submit" value="Alterar">
		<%} %>
		<a href="menu.jsp"><input type="button" value="Voltar"></a>
		<br><br>
		<div>
			<%
			String mensagem = (String) request.getAttribute("mensagem");
			if (mensagem != null){
				out.print(mensagem);
			}
			%>
		</div>
	</form>
</body>
</html>
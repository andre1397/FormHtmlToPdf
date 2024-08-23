<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
		*{
			text-align: center;
		}
		#adm{
			vertical-align: middle;
			margin-right: 2.3em;
		}
		div{
			font-size: large;
		}
	</style>
<title>Novo Usuário</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<h1>Cadastrar novo Usuário</h1>
	<form action="cadastrarUsuario" method="post">
		<label>Nome: </label><input type="text" name="nome">
		<br><br>
		<label>E-mail: </label><input type="email" name="email">
		<br><br>
		<label>Possui permissão para criar usuários:</label><input type="checkbox" name="adm">
		<br><br>
		<label>Recebe Formulário:</label><input type="checkbox" name="recebeForm">
		<br><br>
		<label>Senha: </label><input type="password" name="senha">
		<br><br>
		<label>Repita a senha: </label><input type="password" name="senhaRepetida" style="margin-right: 4em">
		<br><br>
		<input type="submit" value="Criar">
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
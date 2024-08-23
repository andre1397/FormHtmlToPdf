<%@ page import="java.util.List"%>
<%@ page import="br.com.sb.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta</title>
<link rel="icon" href="imagens/favicon.jpeg">
</head>
<body>
	<a href="menu.jsp"><input type="button" value="Voltar"></a>
	
	<h1>Consulta de Usuários</h1>
	
	<h2 style="text-align: center; color:red;">
		<%
			String mensagem = (String) request.getAttribute("mensagem");
		if (mensagem != null){
			out.print(mensagem);
		}
		%>
	</h2>
	
	<%
	if (request.getAttribute("usuarios") != null) {
		List<?> usuarios = (List<?>) request.getAttribute("usuarios");
		for(int cont = 0 ; cont<=(usuarios.size()-1) ; cont++){
			User usuario = (User) usuarios.get(cont);
	%>
	<form action="modificarUsuario" method="post" style="margin-bottom: 1em;">
	<div>
		<div>
			<span>Nome: </span>
			<span><%out.print(usuario.getName()); %></span>
			<input type="hidden" name="nome" value="<%out.print(usuario.getName());%>">
		</div>
		<div>
			<span>E-mail: </span>
			<span><%out.print(usuario.getEmail()); %></span>
			<input type="hidden" name="email" value="<%out.print(usuario.getEmail());%>">
		</div>
		<div>
			<span>Pode Criar Usuários: </span>
			<span><%out.print((usuario.getAdm() == 0) ? "Não" : "Sim"); %></span>
			<input type="hidden" name="adm" value="<%out.print(usuario.getAdm());%>">
		</div>
		<div>
			<span>Recebe Formulário: </span>
			<span><%out.print((usuario.getRecebeForm() == 0) ? "Não" : "Sim"); %></span>
			<input type="hidden" name="recebeForm" value="<%out.print(usuario.getRecebeForm());%>">
		</div>
		<div>
			<input type="hidden" name="senha" value="<%out.print(usuario.getPassword());%>">
		</div>
		<div>
			<input type="submit" name="alterarDados" value="Alterar">
			<input type="submit" name="excluirUsuario" value="Excluir">
		</div>
		<br>
	</div>
	</form>
	<%
		}
	}
	%>
	
</body>
</html>
package br.com.sb.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sb.model.User;

@WebServlet("/cadastroUsuario")
public class CadastrarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarUsuarioController() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	RequestDispatcher dispatcher = request.getRequestDispatcher("newUser.jsp");
		dispatcher.forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String senhaRepetida = request.getParameter("senhaRepetida");
		int recebeForm = (request.getParameter("recebeForm") != null) ? 1 : 0;
		int adm = (request.getParameter("adm") != null) ? 1 : 0;
		String mensagem;
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("newUser.jsp");
		
		if(nome !=null && !nome.isEmpty() && email !=null && !email.isEmpty() && senha !=null && !senha.isEmpty() 
				&& senhaRepetida !=null && !senhaRepetida.isEmpty()) {
			if (senha.equals(senhaRepetida)) {
				Map<String, String> usuarioConsulta = new User().consultar(email);
				if (usuarioConsulta.get("email") != null) {
					mensagem = "Usuário já cadastrado no sistema!";
				} else {
					User usuario = new User(nome, adm, recebeForm, email, senha);
					usuario.salvar();
					mensagem = "Usuário Cadastrado com Sucesso!";
				}
			} else {
				mensagem = "A senha inserida deve ser igual nos dois campos!";
			}
		} else {
			mensagem = "Todos os campos devem ser preenchidos";
		}
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);
	}

}

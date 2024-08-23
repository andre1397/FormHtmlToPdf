package br.com.sb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sb.model.User;

/**
 * Servlet implementation class ModificaController
 */
@WebServlet("/ModificaController")
public class ModificaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		User usuario;
		
		String excluir = request.getParameter("excluirUsuario");
		String alterar = request.getParameter("alterarDados");
		String excluirSim = request.getParameter("excluirSim");
		String excluirNao = request.getParameter("excluirNao");
		String email = request.getParameter("email");
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String adm = request.getParameter("adm");
		String recebeForm = request.getParameter("recebeForm");
		
		if (alterar != null) {
			usuario = new User(nome, Integer.parseInt(adm), Integer.parseInt(recebeForm), email, senha);
			RequestDispatcher dispatcher = request.getRequestDispatcher("alteraUsuario.jsp");
			request.setAttribute("usuario", usuario);
			dispatcher.forward(request, response);
		} else if (excluir != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("excluir.jsp");
			request.setAttribute("email", email);
			dispatcher.forward(request, response);
		} else if (excluirSim != null) {
			String mensagem = "Usuário " + email + " excluído com sucesso!";
			new User().deletaUsuario(email);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/consultarUsuarios");
			request.setAttribute("mensagem", mensagem);
			dispatcher.forward(request, response);
		} else if (excluirNao != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/consultarUsuarios");
			dispatcher.forward(request, response);
		} 
	}

}

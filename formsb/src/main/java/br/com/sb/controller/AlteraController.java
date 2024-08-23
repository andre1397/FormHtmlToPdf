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
 * Servlet implementation class AlteraController
 */
@WebServlet("/AlteraController")
public class AlteraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteraController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	this.doPost(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String email = request.getParameter("email");
		String nomeOriginal = request.getParameter("nomeOriginal");
		String senhaOriginal = request.getParameter("senhaOriginal");
		String adm = request.getParameter("adm");
		String recebeForm = request.getParameter("recebeForm");
		String mensagem = null;
		String novoNome = request.getParameter("novoNome");
		String novaSenha = request.getParameter("novaSenha");
		
		User usuario = new User(nomeOriginal, adm != null? 1 : 0, recebeForm != null? 1 : 0, email, senhaOriginal);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("alteraUsuario.jsp");
			
		if (novoNome!=null && !novoNome.isEmpty()) {
			usuario.setName(novoNome);
		}
		if (novaSenha != null && !novaSenha.isEmpty()) {
				usuario.setPassword(novaSenha);
		}
		if (adm != null && !adm.isEmpty()) {
			usuario.setAdm(adm != null? 1 : 0);
		}
		if (recebeForm != null && !recebeForm.isEmpty()) {
			usuario.setRecebeForm(recebeForm != null? 1 : 0);
		}
			
		usuario.alteraUsuario(email);
		mensagem = "Usuário " + email + " Alterado com sucesso!";
			
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);
	}
}

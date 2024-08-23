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

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String mensagem = null;
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Map<String, String> dadosUser = new User().consultar(email);
		
		if(email == null || email.isEmpty() || dadosUser.get("email") == null) {
			mensagem = "E-mail não cadastrado!";
		} else if (senha == null || senha.isEmpty() || !senha.equals(dadosUser.get("senha"))){
			mensagem = "Senha incorreta!";
		} else {
			dispatcher = (dadosUser.get("adm").equals("0")) ? request.getRequestDispatcher("formulario.jsp") : request.getRequestDispatcher("menu.jsp");
		}
		
		request.setAttribute("mensagem", mensagem);
		request.setAttribute("dadosUser", dadosUser);
		dispatcher.forward(request, response);
		
	}

}

package br.com.sb.controller;

import java.io.IOException;
import java.util.List;
import br.com.sb.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsultaController
 */
@WebServlet("/ConsultaController")
public class ConsultaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		List<User> usuarios = new User().consultarUsuarios();
		request.setAttribute("usuarios", usuarios);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("consultarUsuarios.jsp");
		dispatcher.forward(request, response);
	}

}

package br.com.sb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEnviadoController
 */
@WebServlet("/FormEnviadoController")
public class FormEnviadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEnviadoController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String voltarForm = request.getParameter("voltarForm");
		String desconectar = request.getParameter("desconectar");
		String voltarMenu = request.getParameter("voltarMenu");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formEnviado.jsp");
		
		if(voltarForm!=null) {
			if(voltarMenu!=null) {
				request.setAttribute("voltarMenu", voltarMenu);
			}
			dispatcher = request.getRequestDispatcher("formulario.jsp");
		} else if(desconectar!=null) {
			dispatcher = request.getRequestDispatcher("/fazerLogin");
		}
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formEnviado.jsp");
		
		dispatcher.forward(request, response);
	}

}

package com.cottsoft.soa.app.hr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html；charset=gbk");
		
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		System.out.println(userName);
		System.out.println(password);
		
		//角色由ESB中众AMS系统中获得
		String role = "admin";
		request.setAttribute("role", role);
		request.setAttribute("userName", userName);
		
		request.getRequestDispatcher("/WEB-INF/page/main.jsp").forward(request, response);
		
		response.sendRedirect("page/main.jsp");
	}

}

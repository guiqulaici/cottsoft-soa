package com.cottsoft.soa.app.ams.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cottsoft.soa.app.ams.service.IRoleService;
import com.cottsoft.soa.app.ams.service.ISystemService;
import com.cottsoft.soa.app.ams.service.impl.RoleService;
import com.cottsoft.soa.app.ams.service.impl.SystemService;

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
		
		
		//角色从本系统中获得
		IRoleService roleService = new RoleService();
		String role = roleService.getRole(userName);
		
		ISystemService systemService = new SystemService();
		String systemDate = systemService.getSystemDate();
		
		request.setAttribute("role", role);
		request.setAttribute("userName", userName);
		request.setAttribute("systemDate", systemDate);
		
		request.getRequestDispatcher("/WEB-INF/page/main.jsp").forward(request, response);
	}

}

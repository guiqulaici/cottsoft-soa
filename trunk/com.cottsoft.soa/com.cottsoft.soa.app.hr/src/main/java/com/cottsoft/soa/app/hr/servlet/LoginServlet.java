package com.cottsoft.soa.app.hr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cottsoft.soa.app.hr.service.ILoginService;
import com.cottsoft.soa.app.hr.service.IRoleService;
import com.cottsoft.soa.app.hr.service.ISystemService;
import com.cottsoft.soa.app.hr.service.impl.LoginService;
import com.cottsoft.soa.app.hr.service.impl.RoleService;
import com.cottsoft.soa.app.hr.service.impl.SystemService;

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
		try{
			response.setContentType("text/html；charset=gbk");
			
			
			String userId = request.getParameter("userName");
			String password = request.getParameter("password");
			
	
			System.out.println("user id:"+userId);
			System.out.println("password:"+password);
			
			//实现用当前系统的Login服务
			ILoginService loginService = new LoginService();
			boolean isLogin = loginService.doLogin(userId, password);
			
			if(isLogin){			
				//从ESB中得到系统时间(广播模式)
				ISystemService systemService = new SystemService();
				String systemDate = systemService.getSystemDate();
				
				//从ESB中得到用户权限及角色，实际业务中不会中返回一个角色名称回来
				IRoleService roleService = new RoleService();
				String role = roleService.getRole(userId);
				
				request.setAttribute("role", role);
				request.setAttribute("userName", userId);
				request.setAttribute("systemDate", systemDate);
				
				request.getRequestDispatcher("/WEB-INF/page/main.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

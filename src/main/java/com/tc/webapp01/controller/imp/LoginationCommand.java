package com.tc.webapp01.controller.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.webapp01.controller.Command;

public class LoginationCommand implements Command {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String login;
		String password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		System.out.println(login + " - " + password);
		redirect(request, response);
		
		
		/*PrintWriter out = response.getWriter();
		out.write("<html> <head> <meta charset=\"ISO-8859-1\"> <title>Login Page</title> </head> "
				+ "<body background=\"img/bg.jpg\"> "
				+ "<h3>Welcome " + login + "<hr> Your password is: " + password +"</h3>"
				+"<h3>Back to <a href=\"MyController?command=main\">main page</a>  </h3>"
				+ "</body> </html>"); */
	}
	
	private void redirect(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		 boolean flag = true;
		if(flag) {
			request.setAttribute("userName","tuutua");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mainPage.jsp");
		dispatcher.forward(request, response);
		return;}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}	
	
}

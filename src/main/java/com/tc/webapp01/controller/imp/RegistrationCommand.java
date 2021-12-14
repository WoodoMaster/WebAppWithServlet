package com.tc.webapp01.controller.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.webapp01.controller.Command;

public class RegistrationCommand implements Command {
private String email; //передается дальше на страницу mainpage
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String login;
		String email;
		String password;
		login = request.getParameter("login");
		email = request.getParameter("email");
		this.email = email;
		password = request.getParameter("password");
		redirect(request, response);
	}	
		
	private void redirect(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		 boolean flag = true;  //Заглушка
		if(flag) {
		//передается на mainpage registrationInfo и email;
			response.sendRedirect("Controller?command=GO_TO_MAINPAGE&registrationInfo=ok"+"&email="+email);
		return;}
		request.setAttribute("errorMessage", "Не удалось зарегестрироваться. " +
				"Пожалуйста попробуйте позже!");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}	
		
			/*PrintWriter out = response.getWriter();
		out.write("<html> <head> <meta charset=\"ISO-8859-1\"> <title>Login Page</title> </head> "
				+ "<body background=\"img/bg.jpg\"> "
				+ "<h3>Welcome " + name +" " + surname +  "<hr> Your password is: " + password +"</h3>" + email +"<hr>"
				+"<h3>Back to <a href=\"MyController?command=main\">main page</a>  </h3>"
				+ "</body> </html>");*/
				
	

	
	
}

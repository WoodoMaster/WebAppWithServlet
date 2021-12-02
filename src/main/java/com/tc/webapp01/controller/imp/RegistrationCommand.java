package com.tc.webapp01.controller.imp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.webapp01.controller.Command;

public class RegistrationCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Registration Hello, world!");
		String name;
		String surname;
		String email;
		String password;
		
		name = request.getParameter("name");
		surname = request.getParameter("surname");
		email = request.getParameter("email");
		password = request.getParameter("password");	
		System.out.println(name + " - " + surname);
		redirect(request, response);
		
		/*PrintWriter out = response.getWriter();		
		out.write("<html> <head> <meta charset=\"ISO-8859-1\"> <title>Login Page</title> </head> "
				+ "<body background=\"img/bg.jpg\"> "
				+ "<h3>Welcome " + name +" " + surname +  "<hr> Your password is: " + password +"</h3>" + email +"<hr>" 
				+"<h3>Back to <a href=\"MyController?command=main\">main page</a>  </h3>"
				+ "</body> </html>");*/
		
		
		
	
		
	}	
		
	private void redirect(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		 boolean flag = true;  //заглушка 
		if(flag) {
			response.sendRedirect("Controller?command=GO_TO_MAINPAGE&registrationInfo=All ok!");
			
		//	request.setAttribute("registrationInfo", "All ok!");
		//	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mainPage.jsp");
	//	dispatcher.forward(request, response);
		return;}
		request.setAttribute("errorMessage", "Error!");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}	
		
		
				
	

	
	
}

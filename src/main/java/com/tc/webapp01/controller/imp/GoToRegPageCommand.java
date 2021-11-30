package com.tc.webapp01.controller.imp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tc.webapp01.controller.Command;
import com.tc.webapp01.entity.Greeting;

public class GoToRegPageCommand implements Command {


	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Greeting gr = new Greeting ("Hello Vasya");
		request.setAttribute("myobj", gr);
		request.getAttribute("myobj");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);		
	}

}

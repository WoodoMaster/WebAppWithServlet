package webapp01.controller.imp;



import webapp01.controller.Command;
import webapp01.entity.Greeting;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

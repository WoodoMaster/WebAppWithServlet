package com.tc.webapp01.controller.imp;

import com.tc.webapp01.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangeLanguage implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String locale = request.getParameter("locale");
        request.getSession().setAttribute("locale", locale);
        String url = (String)request.getSession().getAttribute("url");
        response.sendRedirect(url);
    }
}

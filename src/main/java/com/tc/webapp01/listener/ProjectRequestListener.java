package com.tc.webapp01.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class ProjectRequestListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context =  sce.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println("Context from" + contextPath + " was initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context =  sce.getServletContext();
        String contextPath = context.getContextPath();
        System.out.println("Context from" + contextPath + " was destroyed");
    }
    /*
     <listener>
        <listener-class>
            com.tc.webapp01.listener.ProjectRequestListener
        </listener-class>
    </listener>
     */
}

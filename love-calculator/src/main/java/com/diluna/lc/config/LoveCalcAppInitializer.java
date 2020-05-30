/*
package com.diluna.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Approch 1-> More control on developer
public class LoveCalcAppInitializer implements WebApplicationInitializer  {

	public void onStartup(ServletContext servletContext) throws ServletException {
		//This is how XML based webApplication Context Congig
		//XmlWebApplicationContext webApplicationContext=new XmlWebApplicationContext();
		//webApplicationContext.setConfigLocation("classpath:CustomServletDispatcher-servlet.xml");
		
		//This how JAVA based webApplication Context Congig
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalcAppConfig.class);
		
		//create Dispachter Servlet object
		//D.S need WebApplicationContext to initialize
		DispatcherServlet dispatcherservlet =new DispatcherServlet(webApplicationContext); 
		//register the dispatcher servlet with the servlet context object
		ServletRegistration.Dynamic servletRegistration= servletContext.addServlet("myDispatcherServlet", dispatcherservlet);
		//set load on server start
		servletRegistration.setLoadOnStartup(1);
		//Add mapping the base URL
		servletRegistration.addMapping("/mywebsite.com/*");
		
		
		
	}

}
*/
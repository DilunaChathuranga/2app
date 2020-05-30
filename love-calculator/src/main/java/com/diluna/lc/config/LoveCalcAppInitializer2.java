package com.diluna.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Approch 2->More control take by Spring
public class LoveCalcAppInitializer2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//Register Spring Config Class
		Class arr[]= {LoveCalcAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		//configure mapping for Dispatcher Servelet
		String arr[]= {"/"};
		return arr;
		
	}
	

}

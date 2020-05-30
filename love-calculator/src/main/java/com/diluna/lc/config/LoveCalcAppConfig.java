package com.diluna.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.diluna.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.diluna.lc.controllers")
public class LoveCalcAppConfig implements WebMvcConfigurer{

	// For setting up viewResolver
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}
//
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside addformatter...");
		registry.addFormatter(new PhoneNumberFormatter());
		}
}

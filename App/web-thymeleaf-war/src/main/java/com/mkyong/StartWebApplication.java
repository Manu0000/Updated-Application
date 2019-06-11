package com.mkyong;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StartWebApplication extends SpringBootServletInitializer {

	private ServletContext servletContext;
	
    public static void main(String[] args) {
        SpringApplication.run(StartWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	//builder = builder.properties("welcome.message:${welcome.message}");
        return builder.sources(StartWebApplication.class);
    }
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        this.servletContext = servletContext;
        super.onStartup(servletContext);
    }
    
    /*
     * 
     *  public static void main(String[] args) {
        SpringApplication.run(StartWebApplication.class, args);
    }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(StartWebApplication.class);
	    }
     * 
     * 
     */
}
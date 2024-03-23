package com.ras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ras.beans.Customerinfo;

@SpringBootApplication
public class Bootproj5ConfigurationpropertieApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Bootproj5ConfigurationpropertieApplication.class, args);
	    Customerinfo ct=ctx.getBean("custinfo",Customerinfo.class);
	    System.out.println("customer info details::"+ct);
	}

}
  
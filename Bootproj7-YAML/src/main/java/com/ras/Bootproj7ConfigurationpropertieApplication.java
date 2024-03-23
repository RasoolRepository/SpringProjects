package com.ras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ras.beans.Personinfo;


@SpringBootApplication
public class Bootproj7ConfigurationpropertieApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Bootproj7ConfigurationpropertieApplication.class, args);
	    Personinfo per=ctx.getBean("personinfo",Personinfo.class);
	    System.out.println("person details::"+per);
	    ((ConfigurableApplicationContext) ctx).close();
	}

}
  
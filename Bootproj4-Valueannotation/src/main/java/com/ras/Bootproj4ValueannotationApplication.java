package com.ras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ras.beans.Hospital;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class Bootproj4ValueannotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Bootproj4ValueannotationApplication.class, args);
		//get spring  bean class object
		Hospital hospital=ctx.getBean("hsptl",Hospital.class);
		System.out.println("spring bean class object::"+hospital);
		((ConfigurableApplicationContext) ctx).close();
		//System.out.println("system properties::"+System.getProperties());
	}

}

package com.ras.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class Test1Runner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Non-optional args::"+args.getNonOptionArgs());
		System.out.println("option names and values::");
		for(String names:args.getOptionNames()) {
			System.out.println(names+"----->"+args.getOptionValues(names));
		}
		
		
	}

}

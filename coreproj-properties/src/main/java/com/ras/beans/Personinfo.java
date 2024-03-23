//java bean class
package com.ras.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("per")
@PropertySource("com/ras/cfgs/ info.properties")
public class Personinfo {
	@Value("${per.name}")
	private String pname;
	@Value("${per.adrs}")
	private String paddr;
	@Value("${per.age}")
	private int page;
	
	@Override
	public String toString() {
		return "Personinfo [pname=" + pname + ", paddr=" + paddr + ", page=" + page + "]";
		
	}
	
	

}

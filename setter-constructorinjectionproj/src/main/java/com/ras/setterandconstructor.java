package com.ras;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ras.beans.Employee1;
import com.ras.beans.Student;

public class setterandconstructor {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader res=new XmlBeanDefinitionReader(factory);
		res.loadBeanDefinitions("com/ras/cfs/applicationcontext.xml");
		//get spring bean
		Employee1 emp1=factory.getBean("emp1",Employee1.class);
		System.out.println(emp1);
		System.out.println("========");
		Student st1=factory.getBean("stud1",Student.class);
		System.out.println(st1);
		
	}

}

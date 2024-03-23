package com.ras.Test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ras.bo.EmployeeBO;
import com.ras.controller.MainController;
import com.ras.vo.EmployeeVO;

public class RealtimeDI {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ras/cfgs/applicationcontext.xml");
		//get spring bean class object
		MainController controller=factory.getBean("controller",MainController.class);
		//read the inputs as string values and store them into employeevo class object
		Scanner sc =new Scanner(System.in);
		System.out.println("enter ename");
		String name=sc.next();
		System.out.println("enter employee desg::");
		String desg=sc.next();
		System.out.println("enter employee basicsalary::");
		String basicsalary=sc.next();
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(name);
		vo.setDesg(desg);
		vo.setBasicsalary(basicsalary);
		//invoke methods
		try {
			String result=controller.processEmploye(vo);
			System.out.println(result);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

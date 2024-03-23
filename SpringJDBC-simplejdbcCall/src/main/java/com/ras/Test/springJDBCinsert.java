package com.ras.Test;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ras.model.Student;
import com.ras.service.IStudentService;

public class springJDBCinsert {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ras/cfgs/applicationcontext.xml");
        IStudentService service=ctx.getBean("studservice",IStudentService.class);
        Student stu=new Student();
        stu.setSno(505);
        stu.setSname("chiru");
        stu.setSadd("krishna");
        stu.setAvg(76.0F);
        String count=service.insertstudent(stu);
        System.out.println(count);
         ctx.close();
        
	}

}
  
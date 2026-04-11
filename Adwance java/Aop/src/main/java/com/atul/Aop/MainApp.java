package com.atul.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Student stud=(Student)ctx.getBean("stud");
		stud.takeExams();
//		stud.takeTest("AS");
//		stud.conductExams();
		/*
		 * stud.takeTest(); stud.getValid(); TestClass test=new TestClass();
		 * test.takeExams();
		 */
	}

}
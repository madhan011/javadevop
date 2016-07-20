package com.tody.Shopping;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context  =new AnnotationConfigApplicationContext();
		context.scan("com.tody.Shopping");
		System.out.println("Full System Scan");
		context.refresh();
		context.getBean("mad");
		System.out.println("category is created");
		context.close();
	}

}

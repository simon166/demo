package com.zcx.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/zcx/spring/springAction.xml");
		try{
			Performer performer = (Performer)ctx.getBean("duke");
			performer.perform();
			performer = (Performer)ctx.getBean("poeticDuke");
			performer.perform();
			performer = (Performer)ctx.getBean("kenny");
			performer.perform();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			((ClassPathXmlApplicationContext)ctx).close();
		}
		
	}

}

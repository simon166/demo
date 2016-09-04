package com.zcx.advice;

public class StupidWaiter implements Waiter{
	public void greetTo(String name){
		System.out.println("Greet to "+name);
	}
	
	public void serveTo(String name){
		System.out.println("I am serving "+name);
	}
}

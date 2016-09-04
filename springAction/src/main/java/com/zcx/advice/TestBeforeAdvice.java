package com.zcx.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {
	public static void main(String[] args){
		Waiter waiter = new StupidWaiter();
		BeforeAdvice advice = new GreetingBeforeAdvice();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(waiter);
		proxyFactory.addAdvice(advice);
		Waiter proxyWaiter = (Waiter)proxyFactory.getProxy();
		proxyWaiter.greetTo("zcx");
		proxyWaiter.serveTo("simon");
	}
}

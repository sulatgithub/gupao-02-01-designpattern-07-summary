package com.sul.pattern.springaopiocdi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceAspect {
	@Before("execution(* doSave(..))")
	public void beforeDoSave(){
		System.out.println("before dosave!!!");
	}
}

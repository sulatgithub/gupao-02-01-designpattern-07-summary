package com.sul.pattern.springaopiocdi.aop;


public class Service implements IService {

	public void doSave(String param) {
		System.out.println("doSave param:"+param);
	}
}

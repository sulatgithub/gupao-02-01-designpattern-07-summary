package com.sul.pattern.springaopiocdi.aop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class aoptest {

    public static void main(String[] args) {
        IService target = new Service();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);
        factory.addAspect(ServiceAspect.class);
        IService proxy = factory.getProxy();
        proxy.doSave("xxx");
    }
}

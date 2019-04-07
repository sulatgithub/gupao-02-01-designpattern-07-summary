package com.sul.pattern.springaopiocdi.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioctest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Bean1 b1 = (Bean1)ctx.getBean("bean1");
        b1.doomethingS();
    }
}

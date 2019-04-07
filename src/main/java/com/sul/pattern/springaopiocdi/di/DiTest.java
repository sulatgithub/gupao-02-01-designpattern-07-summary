package com.sul.pattern.springaopiocdi.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UseBean1 u = (UseBean1)ctx.getBean("UseBean1");
        u.callBean1();
    }
}

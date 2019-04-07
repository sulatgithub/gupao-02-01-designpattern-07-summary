package com.sul.pattern.springaopiocdi.di;

import com.sul.pattern.springaopiocdi.ioc.Bean1;

public class UseBean1 {
    private Bean1 bean1;

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public void callBean1 () {
        System.out.println("call bean1:");
        bean1.doomethingS();
    }

}

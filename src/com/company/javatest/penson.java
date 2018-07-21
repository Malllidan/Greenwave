package com.company.javatest;

public abstract class penson {
    private String name;
    protected String testname;//子类直接继承这个域，不需要调用公用类返回
    public penson(String aname){
        name=aname;
    }
    public String getName(){
        return name;
    }
}

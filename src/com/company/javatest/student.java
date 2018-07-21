package com.company.javatest;

public class student extends penson{
    private String marjor;
    public student(String aname,String amarjor){
        super(aname);
        marjor=amarjor;

    }
    public String getName(){
        return super.getName()+"haha"+testname;

    }
}

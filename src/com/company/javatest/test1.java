package com.company.javatest;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args){
        Map<String,test1lo> testllo=new HashMap<String, test1lo>();
        test1lo a=new test1lo("9,10");
        testllo.put("A",a);
        System.out.print(testllo.get("A").getX());
//        penson a=new student("M","math");
//        student b=new student("A","english");
//        String k=a.getName();
//        System.out.println(k);
//        k=b.getName();
//        System.out.println(k);
    }
}
class test1lo
{
    private int x;
    private int y;

    public test1lo(String location){
        String [] mid= location.split(",");
        x=Integer.valueOf(mid[0]);
        y=Integer.valueOf(mid[1]);

    }
    public int getX(){
        return x;
    }
}

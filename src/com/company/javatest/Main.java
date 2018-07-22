package com.company.javatest;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    static int calculate(String[] locations) {
        List<Location> locantion=new ArrayList<Location>();
        int num=locations.length;
        int index=0;
        while (num-->0){
            Location midlo=new Location(locations[index++]);
            locantion.add(midlo);
        }
        System.out.println(locantion.get(0).getX());
        //System.out.println(locantion.get(0).getY());


        return 0;
    }//locations是string类型数组，内容是[“x1,t1”，“x2，y2”需拆分

    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int num = Integer.parseInt(scanner.nextLine().trim());
//        int index = 0;
//        String[] locations = new String[num];
//        while(num-- > 0){
//            locations[index++] = scanner.nextLine();
//        }
        String[] locations={"1,1","2,2","4,5","9,7"};
        System.out.println(calculate(locations));
    }
}

class Location{
    private int x;
    private int y;

    public Location(String location){
        String [] mid= location.split(",");
        x=Integer.valueOf(mid[0]);
        y=Integer.valueOf(mid[1]);
    }
    public int getX(){
        return x;

    }

    public int getY() {
        return y;
    }
}

//class Node{
//    private String name;
//
//}
//class Node{
//    private String name;
//    private Map<Node,Integer> child=new HashMap<Node,Integer>();
//    public Node(String name){
//        this.name=name;
//
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public Map<Node,Integer> getChild(){
//        return child;
//    }
//    public void setChild(Map<Node,Integer> child){
//        this.child=child;
//    }
//
//}
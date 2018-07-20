package com.company;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private String data= "ABC 0;BCD 1;CDF 1;BAC 5;CBA 7";
    private listtest target=new listtest("CBA",9);
    private List<listtest> list=new ArrayList<listtest>();
    private List<listtest> endlist=new ArrayList<listtest>();


    public void getdata(){

     String [] mid=data.split(";") ;
     for(String m:mid){
         String [] amid=m.split(" ");
         listtest midlist=new listtest(amid[0],Integer.valueOf(amid[1]));
         list.add(midlist);

     }



    }
    public String Isequal(){
        target.permutation1(target.getx(),"",target.getx().length());
        List<String> midlist=target.getlist();
        for(listtest i:list){

            String name=i.getx();
            if(midlist.contains(name)){
                endlist.add(i);
            }
        }
        if(endlist.size()==0){
            return "False";
        }
        else {
            endlist.add(target);
        }
        for(listtest i:endlist){
            System.out.println("x:"+i.getx()+",y:"+ String.valueOf(i.gety()));
        }
        return "Ture";
    }
    public void show(){
        for(int j=0;j<endlist.size();j++){
            for(int i=0;i<endlist.size()-j-1;i++){
                int nownum=endlist.get(i).gety();
                int prenum=endlist.get(i+1).gety();
                if(prenum>nownum){
                    Collections.swap(endlist,i,i+1);
                }

            }
        }
        for(listtest i:endlist){
            System.out.println("x:"+i.getx()+",y:"+ String.valueOf(i.gety()));
        }
    }
    public static void main(String[] args) {

        Main test=new Main();
        test.getdata();
        String k=test.Isequal();
        System.out.println(k);
        test.show();
	// write your code here
//        List<listtest> list=new ArrayList<listtest>();

    }
}

class listtest{
    private String x;
    private int y;
    private List<String> alllist=new ArrayList<String>();

    public listtest(String x,int y){
        this.x=x;
        this.y=y;
    }
    public String getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public List<String>getlist(){
        return alllist;
    }
    public  void permutation1(String str ,String result ,int len){
        if(result.length()==len){
            System.out.println(result);
            alllist.add(result);
        }
        else{
            for(int i=0;i<str.length();i++){
                if(result.indexOf(str.charAt(i))<0){

                    permutation1(str, result+str.charAt(i), len);
                }
            }
        }
    }
}
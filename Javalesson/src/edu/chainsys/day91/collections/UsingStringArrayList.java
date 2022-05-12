package edu.chainsys.day91.collections;

import java.util.ArrayList;
import java.util.Collection;

public class UsingStringArrayList
{
    
    

public static void usingStringArrayList() 
    {
    ArrayList<String> StringArrayList=new ArrayList<String>();
    System.out.println("initial size of list"+StringArrayList);
    try
    {
        StringArrayList.add("car");
        StringArrayList.add("auto");
        StringArrayList.add("egg");
        StringArrayList.add("box");
        StringArrayList.add("doll");
        StringArrayList.add("fan");
        StringArrayList.add(1,"animal");
        StringArrayList.add("girl");
        StringArrayList.add("fan");
        System.out.println("size of arraylist after addition"+StringArrayList.size());
        System.out.println("contents of stringarray"+StringArrayList);
        StringArrayList.set(2, "xenon");
        System.out.println("after set 2"+StringArrayList);
        System.out.println("last index of fan"+StringArrayList.lastIndexOf("fan"));
        StringArrayList.remove("fan");
        StringArrayList.remove(2);
        System.out.println("size after remove"+StringArrayList.size());
        System.out.println("contents of stringlist"+StringArrayList);
        
    }    
    catch(Exception err) {
        System.out.println(err.getMessage());
        
    }
}
    }
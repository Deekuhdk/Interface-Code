package com.Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class HashMapHashtableExample {
    
    public static void main(String[] args) { 
 
           
  
        Hashtable<String,String> hashtableobj = new Hashtable<String, String>();
        hashtableobj.put("A ", "a");	//Hashtable is thread safe, actions are performed using multithreading
        hashtableobj.put("B", "b");
        hashtableobj.put("C", "c");
        hashtableobj.put("D", "d");
        hashtableobj.put("E", "e");
        hashtableobj.put("F", "f");
        hashtableobj.put("G", "g");
        System.out.println("Hashtable object output :"+ hashtableobj);
 
         
 
        HashMap<String,String> hashmapobj = new HashMap<String,String>();
        hashmapobj.put("A", "a");   //HashMap is not thread safe. 
        hashmapobj.put("B", "b");
        hashmapobj.put("C", "c");
        hashmapobj.put("D", "d");
        hashmapobj.put("E", "e");
        hashmapobj.put("F", "f");
        
        System.out.println("HashMap object output :"+hashmapobj);   
 
 }
}

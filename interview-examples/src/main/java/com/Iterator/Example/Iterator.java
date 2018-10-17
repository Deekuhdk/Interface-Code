package com.Iterator.Example;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
public static void main(String[] args) { 
 
           
  
        List listObject = new ArrayList();
        listObject.add("A ");
        listObject.add("B");
        listObject.add("C");
        listObject.add("D");
        listObject.add("E");
        listObject.add("F");
        listObject.add("G");

        ListIterator listIteratorObject =  listObject.listIterator();
        System.out.println("ListIterator object outadd in forward direction:");
        System.out.println("");

       /**
        * List Iterator with forward and backward direction traversing
        */
         while( listIteratorObject.hasNext() )
         {
           System.out.println(listIteratorObject.next());
         }
      
        System.out.println("ListIterator object outadd in backward direction:");
        System.out.println("");

      
         while( listIteratorObject.hasPrevious() )
         {
           System.out.println(listIteratorObject.previous());
         }
         
         
        List iteratorListObject = new ArrayList();

        iteratorListObject.add("A");  
        iteratorListObject.add("B");
        iteratorListObject.add("C");
        iteratorListObject.add("D");
        iteratorListObject.add("E");
        iteratorListObject.add("F");
        iteratorListObject.add("G");
        iteratorListObject.add("H");
        iteratorListObject.add("I");
        iteratorListObject.add("J");
        
        /**
         * Iterator with only forward direction traversing
         */
        java.util.Iterator javaHungryIterator =  iteratorListObject.iterator();
        System.out.println("Iterator object in forward direction:");

        while( javaHungryIterator.hasNext() )
        {
           System.out.println(javaHungryIterator.next());
        }
 
 }
}
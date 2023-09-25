package Collections;

import java.util.ArrayList;

public class AddElementAtSpecifiedIndex {
	   public static void main(String args[]) {
	        
           ArrayList<String> al = new ArrayList<String>(); 
     
           
           al.add("California");
           al.add("Boston");
           al.add("San jose");
           al.add("New York");
     
           
           al.add(2,"San Francisco");
           System.out.println("ArrayList after adding String San Francisco:"+ al);
            
           
           al.add(0, "Texas");
           
           System.out.println("ArrayList after adding String Texas:"+ al);
    }
}

//remove String elements at the specified index from the ArrayList
//import java.util.*;
//public class RemoveMethodExample {
//    public static void main(String args[]) {
//        // Creating an object of ArrayList of String Type
//        ArrayList<String> list = new ArrayList<>();
//        list.add("AA");
//        list.add("BB");
//        list.add("CC");
//        list.add("DD");
//        list.add("AA");
//        list.add("ZZ");
//        System.out.println("Given ArrayList before remove method: ");
//        for(String str : list) {
//            System.out.println(str);
//        }
//        
//        list.remove(0);
//        
//        list.remove(2);
//        
//        list.remove(3);
//        System.out.println("ArrayList after applying remove method: ");
//        for(String str2 : list) {
//            System.out.println(str2);
//        }
//    }
//}


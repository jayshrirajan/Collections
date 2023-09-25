package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListtoArrayList {

	   public static void main(String args[]) {
	        LinkedList<String> ll = new LinkedList();
	        ll.add("java");
	        ll.add("c++");
	        ll.add("python");
	        List<String> l = new ArrayList(ll);
	        for(String s: l) {
	            System.out.println(s);
	        }
	        
	        
	    }
	}



	// to convert hashset to array
	//import java.util.*;
	//
	//public class HashSetToArray {
//	    public static void main(String args[]) {
//	      
//	      // Create a HashSet object
//	      HashSet<String> hashset = new HashSet<String>();
//	      
//	      // Adding elements to HashSet object
//	      hashset.add("Doctor");
//	      hashset.add("Engineer");
//	      hashset.add("Lawyer");
//	      hashset.add("Police");
//	      
//	      // Printing HashSet elements 
//	      System.out.println("HashSet contains: "+ hashset);
//	      
//	      // Creating an Array of HashSet size
//	      String[] array = new String[hashset.size()];
//	      
//	      // Converting HashSet to Array using toArray() method
//	      hashset.toArray(array);
//	      
//	      // Printing Array elements
//	      System.out.println("Array contains: ");
//	      for (String str : array) {
//	          System.out.println(str);
//	      }
//	    }
	//}

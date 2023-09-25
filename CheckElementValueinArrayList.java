package Collections;

import java.util.ArrayList;

public class CheckElementValueinArrayList {

	  public static void main(String args[]) {
	        // initialize ArrayList  
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        // add elements to ArrayList object
	        al.add(3);
	        al.add(17);
	        al.add(6);
	        al.add(9);
	        al.add(7);
	        // check if ArrayList contains element
	        if (al.contains(7)) {
	            System.out.println("7 was found in the list");
	        } else {
	            System.out.println("7 was not found in the list");
	        }
	    }
}

//Check element exist in hashset
//import java.util.*;
//public class HashSetContainsExample {
//    public static void main(String args[]) {
//        // initialize HashSet  
//        HashSet<Integer> hs = new HashSet<Integer>();
//        // add elements to HashSet object
//        hs.add(3);
//        hs.add(17);
//        hs.add(6);
//        hs.add(9);
//        hs.add(7);
//        // check if HashSet contains element
//        if (hs.contains(7)) {
//            System.out.println("7 was found in the list");
//        } else {
//            System.out.println("7 was not found in the list");
//        }
//    }
//}
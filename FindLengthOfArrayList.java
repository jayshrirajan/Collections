package Collections;

//Integer
import java.util.ArrayList;

public class FindLengthOfArrayList {
	  public static void main (String[] args)
	    { 
	        // Create an Integer ArrayList Object
	        ArrayList<Integer> arrlist=new ArrayList<Integer>(); 
	  
	        // Print initial size of ArrayList  
	        System.out.println("Size before adding elements: "+arrlist.size()); 
	         
	        // Adding elements to ArrayList Object
	        arrlist.add(11);
	        arrlist.add(3);
	        arrlist.add(5);
	        arrlist.add(4);
	        arrlist.add(9);
	 
	        /* Print size of ArrayList
	           after adding elements */ 
	        System.out.println("Size after adding elements: "+arrlist.size()); 
	  
	        // Removing elements from ArrayList 
	        arrlist.remove(1);
	        arrlist.remove(2);
	 
	        /* Print size of ArrayList 
	           after removing elements */ 
	        System.out.println("Size after removing elements: "+arrlist.size()); 
	 
	        // Print ArrayList
	        System.out.println("Resulting ArrayList: ");
	        for(int num: arrlist){
	            System.out.println(num);
	        }
	    }
}

//String
//public class ArrayListSize
//{
//        public static void main (String[] args) 
//   {
//       System.out.println("Java Program to find the size of ArrayList"); 
// 
//       // Create an String ArrayList Object 
//       ArrayList<String> listOfCities = new ArrayList<>(); 
// 
//       int size = listOfCities.size(); 
//       // Print initial size of ArrayList   
//       System.out.println("size of ArrayList after creation: " + size);
// 
//       // Adding elements to ArrayList Object 
//       listOfCities.add("California");
//       listOfCities.add("Boston");
//       listOfCities.add("New York"); 
// 
//       size = listOfCities.size(); 
//       /* Print size of ArrayList 
//          after adding elements */  
//       System.out.println("size of ArrayList after adding elements: " + size); 
// 
//       // clear() method removes all elements
//       listOfCities.clear(); 
// 
//       size = listOfCities.size();
//       System.out.println("size of ArrayList after clearing elements: " + size);
//   }
//}

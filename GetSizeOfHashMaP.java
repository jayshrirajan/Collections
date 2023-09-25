
//HashMap with Integer keys and String values
package Collections;

import java.util.HashMap;

public class GetSizeOfHashMaP {
	
	public static void main(String args[]) {
	      
	      // Creating HashMap object with Integer keys and String values    
	      HashMap<Integer,String> map = new HashMap<>();
	      
	      // Adding elements to the HashMap object
	      map.put(1, "CocoCola");
	      map.put(2, "Pepsi");
	      map.put(3, "Thums Up");
	      map.put(4, "Fanta");
	      
	      // Calculating the size of the HashMap using size() method
	      System.out.println(" Size of the given HashMap is: "+ map.size());
	    }
}

//HashMap with String keys and Integer values
//public static void main(String args[]) {
//    
//    // Creating HashMap object with String keys and Integer values    
//    HashMap<String, Integer> map2 = new HashMap<>();
//    
//    // Putting elements to the HashMap object
//    map2.put("Java", 10);
//    map2.put("Hungry", 20);
//    map2.put("Blog", 30);
//    
//    // Finding the size of the HashMap using size() method
//    System.out.println(" Size of the given HashMap is: "+ map2.size());
//  }


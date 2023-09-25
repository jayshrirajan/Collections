package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizeHashMap {
	
	  public static void main(String args[]) {
	        
		    // Creating a HashMap of Integer keys and String values
		    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		    hashmap.put(1, "Value1");
		    hashmap.put(2, "Value2");
		    hashmap.put(3, "Value3");
		    hashmap.put(4, "Value4");
		    hashmap.put(5, "Value5");
		    Map map= Collections.synchronizedMap(hashmap);
		    Set set = map.entrySet();
		    synchronized(map){
		        Iterator i = set.iterator();
		        // Display elements
		        while(i.hasNext()) {
		            Map.Entry pair = (Map.Entry)i.next();
		            System.out.print(pair.getKey() + ": ");
		            System.out.println(pair.getValue());
		        }
		    }
		  }

}

//Synchronized arrayList 
//public class SynchronizedArrayList {
//    public static void main(String args[]) {
//       
//       // Converting ArrayList to Synchronized ArrayList
//       List<String> synchronizedarraylist = 
//       Collections.synchronizedList(new ArrayList<String>());
//
//       //Adding elements to synchronized ArrayList
//       synchronizedarraylist.add("Basketball");
//       synchronizedarraylist.add("Baseball");
//       synchronizedarraylist.add("Football");
//
//       System.out.println("Synchronized ArrayList Iteration:");
//       synchronized(synchronizedarraylist) {
//       Iterator<String> iterator = synchronizedarraylist.iterator(); 
//       while (iterator.hasNext())
//          System.out.println(iterator.next());
//       }
//  }

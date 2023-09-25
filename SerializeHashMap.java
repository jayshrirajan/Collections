package Collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeHashMap {
	public static void main(String args[]) {
        
	    // Creating a HashMap of Integer keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    hashmap.put(1, "Value1");
	    hashmap.put(2, "Value2");
	    hashmap.put(3, "Value3");
	    hashmap.put(4, "Value4");
	    hashmap.put(5, "Value5");
	    try
	           {
	                  FileOutputStream fos =
	                     new FileOutputStream("hashmap.ser");
	                  ObjectOutputStream oos = new ObjectOutputStream(fos);
	                  oos.writeObject(hashmap);
	                  oos.close();
	                  fos.close();
	                  System.out.printf("Serialized HashMap data is saved in hashmap.ser");
	           }catch(IOException ioe)
	            {
	                  ioe.printStackTrace();
	            }
	  }
	  
}


//Deserialization
//public static void main(String args[]) {
//    
//    HashMap<Integer, String> map = null;
//      try
//      {
//         FileInputStream fis = new FileInputStream("hashmap.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         map = (HashMap) ois.readObject();
//         ois.close();
//         fis.close();
//      }catch(IOException ioe)
//      {
//         ioe.printStackTrace();
//         return;
//      }catch(ClassNotFoundException c)
//      {
//         System.out.println("Class not found");
//         c.printStackTrace();
//         return;
//      }
//      System.out.println("Deserialized HashMap");
//      // Display content using Iterator
//      Set set = map.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key: "+ mentry.getKey() + " & Value: ");
//         System.out.println(mentry.getValue());
//      }
//  }

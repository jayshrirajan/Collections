package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableComparator {
	public static void main(String args[]) {
        
	       ArrayList<student> arraylist = new ArrayList<student>();
	       arraylist.add(new student(111, "John", 23));
	       arraylist.add(new student(222, "Messi", 29));
	       arraylist.add(new student(333, "Ronaldo", 31));
	       Collections.sort(arraylist);

	    for(student str: arraylist){
	   System.out.println(str);
	    }
	  }

}

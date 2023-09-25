//hashset unordered output
package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetpro {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
	}

}

//Hashset another collection
//public static void main(String args[]){  
//	   ArrayList<String> list=new ArrayList<String>();  
//	           list.add("Ravi");  
//	           list.add("Vijay");  
//	           list.add("Ajay");  
//	             
//	           HashSet<String> set=new HashSet(list);  
//	           set.add("Gaurav");  
//	           Iterator<String> i=set.iterator();  
//	           while(i.hasNext())  
//	           {  
//	           System.out.println(i.next());  
//	           }  
//	 }  

//Hashset to print books
//class Book {  
//int id;  
//String name,author,publisher;  
//int quantity;  
//public Book(int id, String name, String author, String publisher, int quantity) {  
//    this.id = id;  
//    this.name = name;  
//    this.author = author;  
//    this.publisher = publisher;  
//    this.quantity = quantity;  
//}  
//}  
//public class HashSetExample {  
//public static void main(String[] args) {  
//    HashSet<Book> set=new HashSet<Book>();  
//    //Creating Books  
//    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
//    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
//    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//    //Adding Books to HashSet  
//    set.add(b1);  
//    set.add(b2);  
//    set.add(b3);  
//    //Traversing HashSet  
//    for(Book b:set){  
//    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
//    }  
//}  
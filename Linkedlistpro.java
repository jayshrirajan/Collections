//Linkedlist
package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistpro {
	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pineapple");
		Iterator itr=list.iterator();  //reverse element (Iterator itr=list.descendingIterator();)
		while(itr.hasNext()) {
			System.out.println(itr.next());
				
		}
	}

}

//LinkedList add element
//public static void main(String args[]){  
//	 LinkedList<String> ll=new LinkedList<String>();  
//	           System.out.println("Initial list of elements: "+ll);  
//	           ll.add("Ravi");  
//	           ll.add("Vijay");  
//	           ll.add("Ajay");  
//	           System.out.println("After invoking add(E e) method: "+ll);  
//	           //Adding an element at the specific position  
//	           ll.add(1, "Gaurav");  
//	           System.out.println("After invoking add(int index, E element) method: "+ll);  
//	           LinkedList<String> ll2=new LinkedList<String>();  
//	           ll2.add("Sonoo");  
//	           ll2.add("Hanumat");  
//	           //Adding second list elements to the first list  
//	           ll.addAll(ll2);  
//	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
//	           LinkedList<String> ll3=new LinkedList<String>();  
//	           ll3.add("John");  
//	           ll3.add("Rahul");  
//	           //Adding second list elements to the first list at specific position  
//	           ll.addAll(1, ll3);  
//	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
//	           //Adding an element at the first position  
//	           ll.addFirst("Lokesh");  
//	           System.out.println("After invoking addFirst(E e) method: "+ll);  
//	           //Adding an element at the last position  
//	           ll.addLast("Harsh");  
//	           System.out.println("After invoking addLast(E e) method: "+ll);  
//	             
//	 }  

//Linkedlist example book
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
//public class LinkedListExample {  
//public static void main(String[] args) {  
//    //Creating list of Books  
//    List<Book> list=new LinkedList<Book>();  
//    //Creating Books  
//    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
//    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
//    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//    //Adding Books to list  
//    list.add(b1);  
//    list.add(b2);  
//    list.add(b3);  
//    //Traversing list  
//    for(Book b:list){  
//    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
//    }  
//}  
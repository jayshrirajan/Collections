package Collections;


import java.util.*;
import java.util.Iterator;

public class Arraylistpro {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Mango");
		list.add("Pineapple");
		list.add("Grapes");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 
	}

}

//Get&Set
//public static void main(String args[]){  
//	  ArrayList<String> al=new ArrayList<String>();  
//	  al.add("Mango");  
//	  al.add("Apple");  
//	  al.add("Banana");  
//	  al.add("Grapes");  
//	  //accessing the element    
//	  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
//	  //changing the element  
//	  al.set(1,"Dates");  
//	  //Traversing list  
//	  for(String fruit:al)    
//	    System.out.println(fruit);    
//	  
//	 }  

//Sort
//public static void main(String args[]){  
//	  //Creating a list of fruits  
//	  List<String> list1=new ArrayList<String>();  
//	  list1.add("Mango");  
//	  list1.add("Apple");  
//	  list1.add("Banana");  
//	  list1.add("Grapes");  
//	  //Sorting the list  
//	  Collections.sort(list1);  
//	   //Traversing list through the for-each loop  
//	  for(String fruit:list1)  
//	    System.out.println(fruit);  
//	      
//	 System.out.println("Sorting numbers...");  
//	  //Creating a list of numbers  
//	  List<Integer> list2=new ArrayList<Integer>();  
//	  list2.add(21);  
//	  list2.add(11);  
//	  list2.add(51);  
//	  list2.add(1);  
//	  //Sorting the list  
//	  Collections.sort(list2);  
//	   //Traversing list through the for-each loop  
//	  for(Integer number:list2)  
//	    System.out.println(number);  
//	 }  


//User-defined Class Objects
//class Student{  
//	  int rollno;  
//	  String name;  
//	  int age;  
//	  Student(int rollno,String name,int age){  
//	   this.rollno=rollno;  
//	   this.name=name;  
//	   this.age=age;  
//	  }  
//	}  
//
//	import java.util.*;  
//	 class ArrayList5{  
//	 public static void main(String args[]){  
//	  //Creating user-defined class objects  
//	  Student s1=new Student(101,"Sonoo",23);  
//	  Student s2=new Student(102,"Ravi",21);  
//	  Student s2=new Student(103,"Hanumat",25);  
//	  //creating arraylist  
//	  ArrayList<Student> al=new ArrayList<Student>();  
//	  al.add(s1);//adding Student class object  
//	  al.add(s2);  
//	  al.add(s3);  
//	  //Getting Iterator  
//	  Iterator itr=al.iterator();  
//	  //traversing elements of ArrayList object  
//	  while(itr.hasNext()){  
//	    Student st=(Student)itr.next();  
//	    System.out.println(st.rollno+" "+st.name+" "+st.age);  
//	  }  
//	 }  
//	}  

//different ways to add an element
//public static void main(String args[]){  
//	  ArrayList<String> al=new ArrayList<String>();  
//	           System.out.println("Initial list of elements: "+al);  
//	           //Adding elements to the end of the list  
//	           al.add("Ravi");  
//	           al.add("Vijay");  
//	           al.add("Ajay");  
//	           System.out.println("After invoking add(E e) method: "+al);  
//	           //Adding an element at the specific position  
//	           al.add(1, "Gaurav");  
//	           System.out.println("After invoking add(int index, E element) method: "+al);  
//	           ArrayList<String> al2=new ArrayList<String>();  
//	           al2.add("Sonoo");  
//	           al2.add("Hanumat");  
//	           //Adding second list elements to the first list  
//	           al.addAll(al2);  
//	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
//	           ArrayList<String> al3=new ArrayList<String>();  
//	           al3.add("John");  
//	           al3.add("Rahul");  
//	           //Adding second list elements to the first list at specific position  
//	           al.addAll(1, al3);  
//	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
//	             
//	 }  

//Different way to remove an element
//public static void main(String [] args)  
//{  
//  ArrayList<String> al=new ArrayList<String>();  
//  al.add("Ravi");    
//  al.add("Vijay");    
//  al.add("Ajay");   
//  al.add("Anuj");  
//  al.add("Gaurav");  
//  System.out.println("An initial list of elements: "+al);   
//  //Removing specific element from arraylist  
//  al.remove("Vijay");  
//  System.out.println("After invoking remove(object) method: "+al);   
//  //Removing element on the basis of specific position  
//  al.remove(0);  
//  System.out.println("After invoking remove(index) method: "+al);   
//    
//  //Creating another arraylist  
//  ArrayList<String> al2=new ArrayList<String>();    
//  al2.add("Ravi");    
//  al2.add("Hanumat");    
//  //Adding new elements to arraylist  
//  al.addAll(al2);  
//  System.out.println("Updated list : "+al);   
//  //Removing all the new elements from arraylist  
//  al.removeAll(al2);  
//  System.out.println("After invoking removeAll() method: "+al);   
//  //Removing elements on the basis of specified condition  
//  al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
//  System.out.println("After invoking removeIf() method: "+al);  
//  //Removing all the elements available in the list  
//  al.clear();  
//  System.out.println("After invoking clear() method: "+al);   
//}  

//ArrayList Example book
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
//public class ArrayListExample20 {  
//public static void main(String[] args) {  
//    //Creating list of Books  
//    List<Book> list=new ArrayList<Book>();  
//    //Creating Books  
//    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
//    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
//    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//    //Adding Books to list  
//    list.add(b1);  
//    list.add(b2);  
//    list.add(b3);  
//    //Traversing list  
//    for(Book b:list){  
//        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
//    }  
//}  
//} 
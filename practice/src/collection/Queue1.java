package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {  
		
		Queue<Book> q = new PriorityQueue<Book>();
	    Queue<Book> queue=new PriorityQueue<Book>();  
	   
	    //Creating Books 
	    Book book1 = new Book(11,"bookName1","AutherName1", 100);
		Book book2 = new Book(12,"bookName2","AutherName2", 200);
		Book book3 = new Book(13,"bookName3","AutherName3", 300);
		Book book4 = new Book(14,"bookName4","AutherName4", 400); 
	   
		//Adding Books to the queue  
	    queue.add(book1);  
	    queue.add(book2);  
	    queue.add(book3); 
	    queue.add(book4);
	   
	    System.out.println("Traversing the queue elements:");  
	   
	    //Traversing queue elements  
	    for(Book b:queue){  
	    System.out.println(b.id+" "+b.autherName+" "+b.bookName+" "+b.quantity);  
	    }  
	    
	    queue.remove();  
	    System.out.println("After removing one book record:");  
	    for(Book b:queue){  
	        System.out.println(b.id+" "+b.autherName+" "+b.bookName+" "+b.quantity);  
	        }  
		
		/*PriorityQueue<String> priorityqueue = new PriorityQueue<>();
		
		priorityqueue.add("Amit");  
		priorityqueue.add("Vijay");  
		priorityqueue.add("Karan");  
		priorityqueue.add("Jai");  
		priorityqueue.add("Rahul");
		
		System.out.println(priorityqueue.size());
		Iterator<String> itr = priorityqueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("top element:-"+ " "+ priorityqueue.element());
		priorityqueue.poll();
		System.out.println("top element:-"+ " "+ priorityqueue.element());
		priorityqueue.poll();
		System.out.println("top element:-"+ " "+ priorityqueue.element());
		System.out.println(priorityqueue.size());*/
		
}
}
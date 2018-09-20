package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
	
	public static void main (String[] args) {
		Book book1 = new Book(001, "ComputerNetworks", "Sriniwasan", 40);
		Book book2 = new Book(002, "Let's C", "Subhas", 60);
		
		ArrayList<Book> al = new ArrayList<Book>(10);
		
		al.add(book1);
		al.add(book2);
	
		Iterator<Book> itr = al.iterator();
		while(itr.hasNext()) {
			Book book = (Book)itr.next();
			System.out.println(book.id+" "+book.autherName+" "+book.bookName+" "+book.quantity);
		}
		
		for(Book book : al) {
			System.out.println(book.id+" "+book.autherName+" "+book.bookName+" "+book.quantity);
		}
		System.out.println(al.size());
		
		
		
		
		
		/*LinkedList<String> al2 = new LinkedList<String>();
		al2.add("rajesh");
		al2.add("kumar");
		al2.add("ankit");
		al2.add("abhishek");
		
		List<String> al3 = new LinkedList<String>();
		al3.add("vaibhav");
		al3.add("sumit");
		al3.add("amisha");
		al3.add("rajesh");
		
		al2.addAll(al3);
		System.out.println(al2.add("richa"));	//true
		
		System.out.println(al2.size());		//9
		
		System.out.println(al2.isEmpty());	//false
		
		System.out.println(al2.contains("rajesh"));	//true	
		System.out.println(al2.contains("raj"));	//false
		al2.set(1, "raje");		
		
		System.out.println(al2.lastIndexOf("rajesh"));		//7
		System.out.println(al2.lastIndexOf("raj"));		//-1
		
		System.out.println(al2);
		
		System.out.println(al2.get(1));		//raje
		al2.set(7, "niharika");
		System.out.println(al2);	
		al2.retainAll(al3);*/
	
		
	}

}

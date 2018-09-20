package collection;

import java.util.*;

public class Book implements Comparable<Book>{
	int id, quantity;
	String bookName, autherName;

	public Book(int id, String bookName, String autherName, int quantity) {

		this.id = id;
		this.bookName = bookName;
		this.autherName = autherName;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book b) {
		if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
	
	public static void main(String[] args) {
		Book b1 = new Book(109, "tom", "atif", 10);
		Book b2 = new Book(100, "kali", "sun", 22);
		TreeSet<Book> tSet = new TreeSet<>();
		tSet.add(b1);
		tSet.add(b2);
		
		for(Book bk: tSet) {
			System.out.println(bk.id);
		}
		
	}
}

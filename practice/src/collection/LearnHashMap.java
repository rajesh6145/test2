package collection;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashMap {

	public static void main(String[] args) {
		Book book1 = new Book(101,"abc","name1",10);
		Book book2 = new Book(101,"abc","name1",10);
		Book book3 = new Book(101,"abc","name1",10);
		Book book4 = new Book(101,"abc","name1",10);
		Book book5 = new Book(101,"abc","name1",10);
		
		HashSet<Book> hash = new HashSet<Book>();
		hash.add(book1);
		hash.add(book2);
		hash.add(book3);
		hash.add(book4);
		hash.add(book5);
		
		for(Book book :hash) {
			System.out.println(book.id+ " "+ book.bookName+ " "+ book.autherName+ " "+ book.quantity );
		}
		System.out.println("******");
		Iterator<Book> itr = hash.iterator();
		while(itr.hasNext()) {
			Book book = (Book)itr.next();
			System.out.println(book.id+ " "+ book.bookName+ " "+ book.autherName+ " "+ book.quantity);
			break;
		}
		
		

	}

}

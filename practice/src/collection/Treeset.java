package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		/*TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Amar");
		treeset.add("akbar");
		treeset.add("nishant");
		treeset.add("rohit");
		treeset.add("kumar");
		treeset.add("rahul");
		treeset.add("amar");
		treeset.add("Rohan");
		treeset.add("akbar");
		
		for(String s : treeset) {
			System.out.println(s);
		}
		System.out.println(treeset.size());
		
		Iterator<String> itr = treeset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}*/
		
		Book book1 = new Book(11,"bookName1","AutherName1", 100);
		Book book2 = new Book(12,"bookName2","AutherName2", 200);
		Book book3 = new Book(15,"bookName3","AutherName3", 500);
		Book book4 = new Book(14,"bookName4","AutherName4", 400);
		
		Set<Book> treeset = new TreeSet<Book>();
		treeset.add(book1);
		treeset.add(book2);
		treeset.add(book3);
		treeset.add(book4);
		

		Iterator<Book> itr = treeset.iterator();
		while(itr.hasNext()) {
			Book book = (Book)itr.next();
			System.out.println(book.id+" "+book.bookName+" "+book.autherName+" "+book.quantity);
		}
		
		for(Book book: treeset) {
			System.out.println(book.id + book.bookName+ book.autherName+ book.quantity);
		}
		
		

	}
}

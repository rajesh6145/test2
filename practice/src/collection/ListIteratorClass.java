package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorClass {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> arlist = new CopyOnWriteArrayList<String>();
		arlist.add("rajesh");
		arlist.add("ankit");
		arlist.add("amisha");
		arlist.add("richa");
		arlist.add("niharika");
		arlist.add("abhishek");
		arlist.add("sumit");
		arlist.add("kumar");
		arlist.add("anmol");
		System.out.println(arlist.size());

		ListIterator<String> itrL = arlist.listIterator();
		while (itrL.hasNext()) {

			System.out.println(itrL.next());

			arlist.add("vaibhav");
			

		}
		System.out.println(arlist);
		System.out.println(arlist.size());

	}

}

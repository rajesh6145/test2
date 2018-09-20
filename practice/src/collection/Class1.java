package collection;

import java.util.ArrayList;

public class Class1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin");  
		System.out.println(al);
		System.out.println("Element at 2nd position: "+al.get(2));  
		

	}


}

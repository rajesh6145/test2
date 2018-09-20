package arrayManipulation;

import java.io.IOException;

public class RoughClass {
	
	public void m1() {
		System.out.println("printing m1");
	}
	
	public void m2() {
		System.out.println("printing m2");
		m1();
		this.m1();
	}
	
	public static void m3() {
		System.out.println("printing m3");
	}

	public static void main(String[] args) throws IOException{
		System.out.println("rough class");
		try {
			System.out.write("sfdsd".getBytes());
		} catch (IOException e) {
			System.out.println("mja nhi aaya");
		}
		
		System.err.println("error");
		System.out.write("hjkhjkh".getBytes());
		System.out.println();
		
		System.out.println("************************************************");
		 	 	
		
		
		

	}

}

package arrayManipulation;

import java.util.Arrays;

public class Anagram {
	
	
	//by using sort and equals method
	public static void testAnagram(String first, String scnd) {
		char[] s1= first.trim().replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] s2= scnd.trim().replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(s1);
		System.out.println(s1);
		Arrays.sort(s2);
		System.out.println(s2);
		if(Arrays.equals(s1, s2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
	}
	
	//without using sort method
	public static void testAnagram2(String first, String scnd) {
		String s1 = first.trim().replaceAll("\\s", "").toLowerCase();
		String s2 = scnd.trim().replaceAll("\\s", "").toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		char[] s1char = s1.toCharArray();
		boolean status= false;
		for(char c: s1char) {
			if(s2.indexOf(c)>0) {
				status= true;
				continue;
			}
			else {
				status= false;
				break;
			}
		}
		if(status) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		testAnagram2("Mother In Law", "Hitler Woman");
		
	}
	
	static public void revereAnInt(int num) {
		String string = Integer.toString(num);
		StringBuffer strBuf = new StringBuffer(string);
		strBuf = strBuf.reverse();
		num= Integer.parseInt(strBuf.toString());
		System.out.println(num);
	}

}

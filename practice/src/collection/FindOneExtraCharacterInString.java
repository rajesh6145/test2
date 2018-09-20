package collection;

import java.util.HashMap;
import java.util.LinkedList;

public class FindOneExtraCharacterInString {
	
	public static void approach1(String str1, String str2) {
		/*char[] ary1 = str1.toCharArray();
		char[] ary2 = str2.toCharArray();*/
		
		LinkedList<Character> list = new LinkedList<>() ;
		for(int i = 0 ; i<str2.length();i++) {
			list.add(str2.charAt(i));
			
		}
		
		System.out.println("second array---");
		System.out.println(list);
		
		for(int j=0; j<str1.length();j++) {
			list.remove();
		}
		
		System.out.println("extra char");
		System.out.println(list);
		
 	}
	
	//not working
	public static void approach2(String str1, String str2) {
		char[] ary1 = str1.toCharArray();
		char[] ary2 = str2.toCharArray();
		
		HashMap<Integer,Character> hash = new HashMap<>() ;
		for(int i = 0 ; i<str2.length();i++) {
			hash.put(i,str2.charAt(i));
			
		}
		
		System.out.println("second array");
		System.out.println(hash);
		
		for(int j=0; j<str1.length();j++) {
			hash.remove(str1.charAt(j));
		}
		
		System.out.println("extra char");
		System.out.println(hash);
		
 	}
	
	
	public static void approach3(String str1, String str2) {
		for(int i=0; i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i))>=0) {
				str2= str2.replace(str1.charAt(i), ' ');
			}
		}
		System.out.println("approach 3");
		System.out.println(str2);
		
		
	}

	public static void main(String[] args) {
		String str1 = "abcd";
		String  str2 = "abcda";
		for(int i=0; i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i))>=0) {
				System.out.println(str2.indexOf(str1.charAt(i)));
			}
		}
		
		//approach1(str1,str2);
		
		approach3(str1,str2);
		
	}

}

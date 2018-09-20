package arrayManipulation;

import java.util.Arrays;

public class StringReversal {
	
	public static String reverseWithCharAry2(String string) {
		string = string.trim();
		 byte[] st= string.getBytes();
		 byte[] result = new byte[string.length()];
		 for(int i =0;  i<result.length;  i++) {
			 result[i]= st[st.length-1-i];
		 }
		
		
		return "";
	}
	
	public static String reverseWithAddOprtr(String str) {
		String result="";
		for(int i =str.length()-1; i>=0;i--) {
			result = result+ str.charAt(i);
		}
		return result;
	}
	
	public static String reverseWithStrBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseWithAddOprtr("adobe"));
		System.out.println(reverseWithStrBuffer("adobe"));
		//System.out.println(reverseWithCharAry("adobe"));
	}

}

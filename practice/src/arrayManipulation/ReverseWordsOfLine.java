package arrayManipulation;

public class ReverseWordsOfLine {
	
	
	
	public static void main(String[] args) {
		String givenString = "Life of a pie";
		String[] testString = givenString.trim().split(" ");
		for(String str : testString) {
			
			System.out.print(reverseString(str));
			System.out.print(" ");
		}
		
	}
	
	public static String reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
	

}

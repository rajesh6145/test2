package stringManipulation;

public class CamelCase {
	
	public static void convertoCamelCase(String str) {
		System.out.println("given string is- "+str);
		String result="";
		for(String st: str.split(" ")) {
			result= result+makecapital(st);
		}
		System.out.println("camel cased string is- "+result);
		
	}
	
	public static String makecapital(String string) {
		String s= string.substring(0, 1).toUpperCase()+string.substring(1, string.length());
		return s+" " ;
	}

	public static void main(String[] args) {
		convertoCamelCase("my name is ankit");
		
		
		
	}
}

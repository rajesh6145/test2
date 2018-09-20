package allaink;

import java.lang.management.ManagementFactory;

public class FindLengthofStr {

	public static void main(String[] args) {
		/*String str = "John Ashcroft g5a?ve orders to his s8taff to tightly bind him in h0eavy chains before the n9ext full m1oon x";
		String StrWithOutSpace = str.replaceAll(" ", "");
		System.out.println(str.length());
		
		System.out.println("Number of space:- " + (str.length()-StrWithOutSpace.length()));  						   //Space
		
		System.out.println("Number of Numberic Char:- "+ (StrWithOutSpace.replaceAll("[^0-9]", "").length()));         //numberic char
		
		System.out.println("Number of char:- "+ (str.replaceAll("[^a-z A-Z]", "")).length());				           //char
		 */
		
		
		System.out.println(System.getProperty("java.version"));
		
		System.out.println(ManagementFactory.getRuntimeMXBean().getVmVersion());
		
		System.out.println(System.getProperty("sun.arch.data.model"));
	}
}


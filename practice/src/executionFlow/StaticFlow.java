package executionFlow;

public class StaticFlow {
	
	static int i = 10;
	 static {
		 m1();
		 System.out.println("first st. block");
	 }
	 
	 public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}
	 
	 public static void m1() {
		System.out.println(j);
	}
	 
	 static {
		 System.out.println("second st. block");
	 }
	 
	 static int j = 20;
	 

}

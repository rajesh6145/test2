package overriding;

public class ChildClass extends ParentClass {

	public  String method() {
		return"string";	
	}
	
	public void varArgmethod(char x) {
		System.out.println("char-child");
	}
	
	public static void staticMethod() {
		System.out.println("static method child");
	}
	

}

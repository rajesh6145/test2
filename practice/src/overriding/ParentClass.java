package overriding;

public class ParentClass {

	public  Object method() {
		return "objectString";
	}
	
	public void varArgmethod(int x) {
		System.out.println("int-parent");
	}
	
	public static void staticMethod() {
		System.out.println("static method");
	}
}

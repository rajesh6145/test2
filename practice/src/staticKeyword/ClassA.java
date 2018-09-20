package staticKeyword;

public class ClassA {
	int rollNo;
	String name;
	static String clgName="Blue bells";
	static {
		System.out.println(clgName+" "+ "only static");
		System.out.println("only static");
	}
	
	ClassA(int rollNo, String name){
		this.rollNo= rollNo;
		this.name= name;
		
	}
	
	public void display() {
		System.out.println(rollNo+ " "+ name+ " "+ clgName);
	}
	
	
	public static void main(String[] args) {
		System.out.println(clgName);
		clgName= "VNM public school";
		ClassA obj1 = new ClassA(101, "rajesh");
		ClassA obj2 = new ClassA(102, "piku");
		obj1.display();
		obj2.display();
		main(12);
		
	}
	public static void main(int y) {
		System.out.println("printing-"+ y + " inside main method");
		
	}

}
	
package cunstructor;

public class Rough {
	
	public static Rough obj;
	
	public static void printObj() {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		obj = new Rough();
		printObj();
	}

}

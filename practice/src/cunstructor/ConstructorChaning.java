package cunstructor;

public class ConstructorChaning {
	ConstructorChaning(){
		System.out.println("this is a non parameterized constructor");
	}
	
	ConstructorChaning(int i){
		this();
		System.out.println("this is a parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		ConstructorChaning obj = new ConstructorChaning(2);
		
	}

}

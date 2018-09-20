package cunstructor;

public class SingletonClass {

	static SingletonClass objSingletonClass;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (objSingletonClass == null) {
			objSingletonClass = new SingletonClass();
		}
		return objSingletonClass;
	}

	/*public static void main(String[] args) {
		System.out.println(getInstance());
		System.out.println(getInstance());
		System.out.println(getInstance());
		System.out.println(getInstance());
	}
	*/
	
	public void SingleTonClassMethod() {
		System.out.println("mthod in singleton class");
	}

}

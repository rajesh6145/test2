package cunstructor;

public class Constructor {

	public void method(Constructor obj) {

		System.out.println("method---accepting contructor");
	}

	void method2() {
		method(this);
		this.method(this);

	}

	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		obj1.method(obj1);
		obj1.method(new Constructor());
	

		obj1.method2();
		// obj1.method(this);

	}

}

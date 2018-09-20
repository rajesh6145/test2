package oopsConcept;

public class TestClass {

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.setName("sarbjit");
		obj.setExp(5);
		obj.setSalary(obj.getExp(), 23000);
		

		System.out.println(obj.getName());
		System.out.println(obj.getExp());
		System.out.println(obj.getSalary());
	}

}

package oopsConcept;

public class BaseClass {
	
	private String name;
	private int exp;
	private int salary;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setExp(int exp) {
		this.exp= exp;
	}
	
	public void setSalary(int exp, int salary) {
		if(exp>=3) {
			this.salary= salary;
			System.out.println("salary has been set to:-"+ salary);
		}
		else {
			System.out.println("the emplyoee is not eligible");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getSalary() {
		return salary;
	}
	
	

}

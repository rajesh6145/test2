package executionFlow;

public class InstanceFlow {
	
	int i=10;
	{
		m1();
		System.out.println("first instance bloack");
	}
	
	public  InstanceFlow() {
		System.out.println(" istance constructor");
	}

	public static void main(String[] args) {
		
		InstanceFlow objI = new InstanceFlow();
		InstanceFlow objI2 = new InstanceFlow();
		System.out.println("main method");
		
	}
	
	public void m1() {
		System.out.println(j);
		
	}
	
	{
		
		System.out.println("second instance block");
	}
	 int j=20;

}

package arrayManipulation;

public class Fatorial {
	
	public static int findFactorialof(int num) {
		int prod= 1;
		for(int i=num; i>1; i--) {
			prod= prod*i;
		}
		return prod;
	}
	
	
	static int prod=1;
	public static int fatorialRecursive(int num) {
		if(num>=1) {
			prod= prod*num;
			fatorialRecursive(num-1);
		}
		return prod;
	}
	
	
	public static void main(String[] args) {
		System.out.println(findFactorialof(5));
		System.out.println("fatorial with recursive method is:--" + fatorialRecursive(5));
	}

}

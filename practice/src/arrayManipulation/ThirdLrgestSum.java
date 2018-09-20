package arrayManipulation;

public class ThirdLrgestSum {

	
	
	public static void main(String[] args) {
		int  sum;
		 int first = 0;
		 int scnd = 0;
		 int third = 0;
	
		 int[] intAry= {3,6,2,7,8,19,13,15};
		for(int i =0 ; i<1; i++) {
			sum = intAry[i]+intAry[i+1];
			System.out.println("sum-"+sum);
			swap(sum, first);
			swap(first, scnd);
			swap(scnd, third);
		}
		System.out.println("rsult-"+third);
	}
	
	public static void swap(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		if(a>b) {
			int temp = a;
			a=b;
			b=temp;
		}
		
	}

}

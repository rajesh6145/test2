package arrayManipulation;

public class LeapYear {
	static int  count= 0;

	public static void main(String[] args) {
		for(int i= 1850; i<=2018; i++) {
			if(checkLeapYr(i)) {
				count= count+1;
			}
		}
		System.out.println(count);

	}
	
	public static boolean checkLeapYr(int yr) {
		if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
			//System.out.println("leap year");
			return true;
		}
		else {
			//System.out.println("not leap");
			return false;
		}

		
	}


}

package arrayManipulation;

public class FindPrimeNumber {

	public static void testPime(int first, int last) {
		int count=0;
		for (int i=first; i<= last; i++) {

			boolean flag = false;
			for (int div = 2; div <= i / 2; div++) {
				if (i % div == 0) {
					flag = true;
					
					break;
				}
			}
			if (!flag) {
				count++;
				System.out.println(i + " -is a prime number");
			}

		}
		System.out.println("total prime no count is:-"+ count);

	}

	public static void main(String[] args) {
		//testNoIsPrime(1);
		testPime(10, 20);
	}

	public static void testNoIsPrime(int number) {
		boolean flag = false;
		for (int div = 2; div <= number / 2; div++) {
			if (number % div == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("prime number h bhai");
		} else {
			System.out.println("na bhai prime to nhi h");

		}

	}

}

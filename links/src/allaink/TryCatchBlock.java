package allaink;

public class TryCatchBlock {

	public static void main(String[] args) {
		try {
			int i = 5/0;
			
		} catch (Exception e1) {
			try {
				int i = 5/0;
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.println("bat abhi bhi nhi bni");
			}
		}
		
	}

}

package oddOrEven;

public class OddOrEven {
	
	public static String oddOrEven (int[] array) {
		
		int sum = 0;
		
		for (int element : array) {
			sum += element;
		}
		
		System.out.println((sum % 2 == 0) ? "even": "odd");
		return (sum % 2 == 0) ? "even": "odd";
	}
	
	public static void main (String args[]) {
		
		int[] array = {0, -1, -5};
		oddOrEven(array);
		
	}

}

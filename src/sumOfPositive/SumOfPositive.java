package sumOfPositive;

public class SumOfPositive {

	public static int sum(int[] arr) {
		
		int sum = 0;
		
		for (int number : arr) {
			if (number > 0) {
				sum += number;
			}
		}
		
		return sum ;
	}

	public static void main(String args[]) {
		
		System.out.println(sum(new int[] {1,-4,7,12}));
		
	}

}

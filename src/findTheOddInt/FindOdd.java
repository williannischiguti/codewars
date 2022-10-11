package findTheOddInt;

public class FindOdd {
	
	public static int findIt(int[] a) {
		
		int odd = 0;
		
		for (int i = 0; i < a.length; i++) {
			odd = odd ^ a[i];
		}
		
		System.out.println(odd);
	  	return odd;
	  }

	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 1, 4, 4};
		
		findIt(numbers);
	}

}

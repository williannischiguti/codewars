package sumOfOddNumbers;

import java.util.Arrays;

public class SumOfOddNumbers {
	
    public static int rowSumOddNumbers(int n) {
    	
    	int[] sum = new int[n];
    	int count = n*(n-1)+1;
    	sum [0] = count;
    	
    	for (int i = 1; i < n; i++) {
    		if (n == 1) {
    			return 1;
    		} else {
    			count += 2;
    			sum[i] = count;
    		}
    	}
    	
    	System.out.println(Arrays.toString(sum));
    	
    	return Arrays.stream(sum).sum();
    }
	
	public static void main (String args []) {
		
		System.out.println(rowSumOddNumbers(42));
	}

}

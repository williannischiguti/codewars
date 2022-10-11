package findTheSmallestInteger;

import java.util.Arrays;

public class FindTheSmallestInteger {
	
    public static int findSmallestInt(int[] args) {
    	
    	Arrays.sort(args);
    	
    	System.out.println(args[0]);
    	return args[0];
    }

	public static void main (String args []) {
		
		int[] numbers = {34, -345, -1, 100};
		
		findSmallestInt(numbers);
	}
	
}

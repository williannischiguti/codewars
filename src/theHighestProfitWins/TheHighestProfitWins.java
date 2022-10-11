package theHighestProfitWins;

import java.util.Arrays;

public class TheHighestProfitWins {
	
    public static int[] minMax(int[] arr) {
        
    	Arrays.sort(arr);
    	
    	return new int[] {arr[0], arr[arr.length-1]};
    }
	
	public static void main (String args []) {
		
		System.out.println(Arrays.toString(minMax(new int[] {1,2,3,4,5})));
		
	}

}

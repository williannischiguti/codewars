package sumMixedArray;

import java.util.Arrays;
import java.util.List;

public class SumMixedArray {
	
	public static int sum(List<?> mixed) {	
		
		int sum = 0;
	
		for (int i = 0; i < mixed.size(); i++) {
			sum += Integer.parseInt(mixed.get(i).toString());
		}
		
		return sum;
	}
	
	public static void main (String args[]) {
		
		System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
		
	}

}

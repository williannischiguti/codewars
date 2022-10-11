package sumMixedArray;

import java.util.Arrays;
import java.util.List;

public class SumMixedArrayAlternative {
	
	public static int sum(List<?> mixed) {	
		
		return mixed.stream().mapToInt(x -> Integer.parseInt(x.toString())).sum();
	}
	
	public static void main (String args[]) {
		
		System.out.println(sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
		
	}

}

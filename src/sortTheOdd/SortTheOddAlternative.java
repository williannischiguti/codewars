package sortTheOdd;

import java.util.Arrays;

public class SortTheOddAlternative {

	public static int[] sortArray(int[] array) {
	
	    int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
	    
	    for (int i = 0, n = 0; i < array.length; i++) {
	    	
	      if (array[i] % 2 == 1) {
	    	  array[i] = sortedOdd[n++];
	      }
	    }
	    
	    return array;

	}

	public static void main(String args[]) {

		System.out.println(Arrays.toString(sortArray(new int[] {5, 3, 1, 8, 0, 1, 7, 9, 3})));
		
	}

}

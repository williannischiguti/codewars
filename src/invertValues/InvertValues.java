package invertValues;

import java.util.Arrays;

public class InvertValues {
	
	  public static int[] invert(int[] array) {
		  
		  for (int i = 0; i < array.length; i++) {
			  array[i] = (array[i] < 0) ? Math.abs(array[i]) : Math.negateExact(array[i]);
		  }
		  
		  System.out.println(Arrays.toString(array));
		  return array;
		  }
	
	public static void main (String args[]) {
		
		int[] array = {1,-2,3,-4,5};
		
		invert(array);
		
	}

}

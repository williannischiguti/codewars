package findeTheUniqueNumber;

import java.util.Arrays;

public class FindTheUniqueNumber {

	public static double findUniq(double arr[]) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		double unique = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					break;
				} else {
					unique = arr[i];
				}
			}
		}
		
		System.out.println(unique);
		
		return unique;
	}

	public static void main(String args[]) {
		
		findUniq(new double[]{ 0, 0, 0.55, 0, 0 });
	}

}

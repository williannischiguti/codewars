package arrayPlusArray;

import java.util.Arrays;

public class ArrayPlusArrayAlternative {

	public static int arrayPlusArray(int[] arr1, int[] arr2) {

		return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
	}

	public static void main(String args[]) {

		System.out.println(arrayPlusArray(new int[] { 100, 200, 300 }, new int[] { 400, 500, 600 }));

	}

}

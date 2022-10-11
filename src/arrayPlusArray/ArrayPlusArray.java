package arrayPlusArray;

public class ArrayPlusArray {

	public static int arrayPlusArray(int[] arr1, int[] arr2) {

		int sum = 0;
	
		for (int n : arr1) {
			sum += n;
		}
		
		for (int n : arr2) {
			sum += n;
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));

	}

}

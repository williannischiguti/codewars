package findTheParityOutlier;

public class FindOutlier {

	static int find(int[] integers) {

		int countOdd = 0;
		int countEven = 0;
		int oddNumber = 0;
		int evenNumber = 0;
		int outlier = 0;

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] % 2 == 0) {
				countOdd += 1;
				oddNumber = integers[i];
			}
			if (!(integers[i] % 2 == 0)) {
				countEven += 1;
				evenNumber = integers[i];
			}
		}

		if (countOdd == 1) {
			outlier = oddNumber;
		} else if (countEven == 1) {
			outlier = evenNumber;
		}

		System.out.print(outlier);

		return outlier;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integers = { 2, 4, 0, 100, 4, 11, 262, 36 }; // should return 11
		//int[] integers2 = { 160, 3, 1719, 19, 11, 13, -21 }; // should return 160

		find(integers);

	}

}

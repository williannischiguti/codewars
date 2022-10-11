package convertNumberToReversedArrayOfDigits;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArrayDigits {

	public static int[] digitize(long n) {

		String numberToString = Long.toString(n);
		int number = 0;
		int count = 0;
		int[] reversedArray = new int[numberToString.length()];

		if (n >= 0) {

			for (int i = numberToString.length() - 1; i >= 0; i--) {
				number = Integer.parseInt(String.valueOf(numberToString.charAt(i)));
				reversedArray[count] = number;
				count += 1;
			}

			System.out.print(Arrays.toString(reversedArray));

			return reversedArray;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		digitize(n);

		sc.close();
	}

}

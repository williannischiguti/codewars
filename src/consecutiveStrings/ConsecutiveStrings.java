package consecutiveStrings;

import java.util.Arrays;

public class ConsecutiveStrings {

	public static String longestConsec(String[] strarr, int k) {

		if (strarr.length == 0 || k > strarr.length || k <= 0) {
			return "";
		}

		System.out.println("Array: " + Arrays.toString(strarr));
		String str = "";
		String longestString = "";
		int count = 0;

		if (k == 1) {
			for (int i = 0; i < strarr.length; i++) {
				str += strarr[i];
				count += 1;
				if (str.length() > longestString.length()) {
					longestString = str;
				}
				if (count == k) {
					count = 0;
					str = "";
				}
			}
		} else {

			for (int i = 0; i < strarr.length; i++) {
				str += strarr[i];
				count += 1;

				if (str.length() > longestString.length()) {
					longestString = str;
				}
				if (count == k) {
					count = 0;
					str = "";
					i -= 1;
				}
			}
		}

		return longestString;
	}

	public static void main(String args[]) {

		System.out.println(longestConsec(
				new String[] {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"},2));

	}

}

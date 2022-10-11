package pairOfGloves;

import java.util.Arrays;

public class PairOfGloves {

	public static int numberOfPairs(String[] gloves) {

		Arrays.sort(gloves);
		System.out.println(Arrays.toString(gloves));

		int pair = 0;

		for (int i = 1; i < gloves.length; i++) {
			if (gloves[i - 1] == gloves[i]) {
				pair += 1;
				i += 1;
			}
		}
		return pair;
	}

	public static void main(String args[]) {

		System.out.println(numberOfPairs(new String[] {"red", "red", "red", "red", "red", "red"}));
	}

}

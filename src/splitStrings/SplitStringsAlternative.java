package splitStrings;

import java.util.Arrays;

public class SplitStringsAlternative {

	public static String[] solution(String s) {

		if (s.length() % 2 == 1) {
			s += "_";
		}

		String[] splitStrings = new String[s.length() / 2];
		for (int i = 0; i < splitStrings.length; ++i) {
			splitStrings[i] = "" + s.charAt(i * 2) + s.charAt(1 + i * 2);
		}
		
		System.out.println(Arrays.toString(splitStrings));
		
		return splitStrings;
	}

	public static void main(String[] args) {

		solution("abcde");
	}

}

package splitStrings;

import java.util.Arrays;

public class SplitStrings {

	public static String[] solution(String s) {

		String[] splitStrings = new String[(s.length() %2 == 0) ? s.length()/2 : (s.length()/2) +1];
		String string = "";
		int countString = 0;
		int countWord = 0;
		
		for (int i = 0; i < s.length(); i++) {
			countString +=1;
			if (countString < 3) {
				string += s.charAt(i);
			}
			if (countString == 2) {
				splitStrings[countWord] = string;
				string = "";
				countString = 0;
				countWord += 1;
			}
		}
		
		if (s.length() %2 != 0) {
			splitStrings[(s.length()/2)] = s.charAt((s.length()-1)) + "_";
		}
		
		System.out.println(Arrays.toString(splitStrings));

		return splitStrings;
	}

	public static void main(String args[]) {
		solution("abcdefgh");
	}
}

package stopSpinningMyWords;

import java.util.ArrayList;
import java.util.List;

public class SpinWords {

	public static String spinWords(String sentence) {

		String[] splitWords = sentence.split(" ");
		List<String> splitWordsList = new ArrayList<String>();
		String spinningWord = "";

		for (int i = 0; i < splitWords.length; i++) {
			if (splitWords[i].length() > 4) {
				spinningWord = new StringBuilder(splitWords[i]).reverse().toString();
				splitWordsList.add(spinningWord);
			} else {
				splitWordsList.add(splitWords[i]);
			}
		}

		String spinningWords = "";

		for (String word : splitWordsList) {
			spinningWords += word + " ";
		}

		spinningWords = spinningWords.trim();
		
		System.out.print(spinningWords);
		
		return spinningWords;

	}

	public static void main(String[] args) {
		
		String sentence = "Welcome to Brazil";

		spinWords(sentence);
		
	}
}

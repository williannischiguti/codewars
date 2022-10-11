package shortestWord;

public class ShortestWord {

	public static int findShort(String s) {

		String[] words = s.split(" ");
		String shortestWord = words[0];
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() < shortestWord.length()) {
				shortestWord = words[i];
			}
		}
		
		return shortestWord.length();
	}

	public static void main(String args[]) {

		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		
	}

}

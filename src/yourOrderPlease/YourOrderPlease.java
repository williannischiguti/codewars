package yourOrderPlease;

public class YourOrderPlease {
	public static String order(String words) {
		
		if(!words.contains("1")) return "";
		
		String[] splitWords = words.split(" ");
		int countNumber = 1;
		words = "";
		
		while (countNumber <= splitWords.length) {
			for (int i = 0; i < splitWords.length; i++) {
				if (splitWords[i].contains(String.valueOf(countNumber))) {
					words += splitWords[i].concat(" ");
					countNumber += 1;
				}
			}
		}
		
		return words.stripTrailing();
	}

	public static void main(String args[]) {

		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));

	}

}

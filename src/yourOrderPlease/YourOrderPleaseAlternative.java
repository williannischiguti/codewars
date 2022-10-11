package yourOrderPlease;

public class YourOrderPleaseAlternative {

	public static String order(String words) {
		
		String[] arr = words.split(" ");
		StringBuilder result = new StringBuilder("");
		String result2 = "";
		
		for (int i = 1; i < 10; i++) {
			for (String s : arr) {
				if (s.contains(String.valueOf(i))) {
					result.append(s + " ");
					result2 += s.concat(" ");
				}
			}
		}
		
		System.out.printf("Alternativo %s%n", result2.trim());
		
		return result.toString().trim();
	}

	public static void main(String args[]) {

		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));

	}
}

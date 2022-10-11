package mumbling;

public class Mumbling {

	public static String accum(String s) {
		
		String[] letters = s.split("");
		String newString = "";
		int count = 1;
		
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				newString += letters[i].toUpperCase().concat("-");
			} else if (i > 0 && i <= s.length()-2) {
				newString += letters[i].toUpperCase().concat(letters[i].toLowerCase().repeat(count)).concat("-");
				count += 1;
			} else {
				newString += letters[i].toUpperCase().concat(letters[i].toLowerCase().repeat(count));
			}
		}
		
		return newString;
	}

	public static void main(String args[]) {

		System.out.println(accum("RqaEzty"));
		
	}
}

package breakCamelCase;

public class BreakCamelCase {

	public static String camelCase(String input) {
		
		String newString = "";
		for (int i = 0; i < input.length(); i++) {
			newString += ((input.charAt(i)+"").matches("[A-Z]")) ? (" ".concat(input.charAt(i)+"")): (input.charAt(i)+"") ;
		}
		
		return newString.trim();
	}

	public static void main(String args[]) {
		
		System.out.println(camelCase("camelCasing"));
	}

}

package breakCamelCase;

public class BreakCamelCaseAlternative {

	public static String camelCase(String input) {
		
		return input.replaceAll("([A-Z])", " $1");
		
	}

	public static void main(String args[]) {
		
		System.out.println(camelCase("camelCasing"));
	}

}

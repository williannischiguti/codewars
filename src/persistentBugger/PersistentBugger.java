package persistentBugger;

import java.util.Arrays;

public class PersistentBugger {
	
	public static int persistence(long n) {
		
		if (String.valueOf(n).length() == 1) {
			return 0;
		}
		
		String str = String.valueOf(n);
		int number = 1;
		int operations = 0;
		String [] split = str.split("");
		int count = 0;
		
		while (str.length() > 1) {
			count += 1;
			System.out.printf("%dª operação: %s%n", count, Arrays.toString(split));
			
			for (String element : split) {
				number *= Integer.parseInt(element);
			}
			
			System.out.println("Resultado: " + number);
			operations += 1;
			str = String.valueOf(number);
			split = str.split("");
			number = 1;
		}
			
		return operations;
	}
	
	public static void main (String args []) {
		
		System.out.println(persistence(982346982));
		
	}

}

package areTheyTheSame;
import java.util.Arrays;

public class AreTheyTheSameAlternative {
	
	public static boolean comp(int[] a, int[] b) {
		
		if (a == null || b == null) {
			return false;
		}
		
		// Verifica se as arrays são iguais dado o predicado
		// x tal que x elevado ao quadrado é igual ao elemento b
		// tanto array a quanto b estão ordenados com sorted
		return  Arrays.equals(
	            Arrays.stream(a).map(x -> (int) Math.pow(x, 2)).sorted().toArray(),
	            Arrays.stream(b).sorted().toArray());
	}
	
	public static void main (String args []){
		
		int[] a = { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = { 121, 14641, 20736, 361, 25921, 361, 20736, 361};

		System.out.println(comp(a, b));
	}

}

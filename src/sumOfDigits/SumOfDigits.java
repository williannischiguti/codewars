package sumOfDigits;

import java.util.Arrays;

public class SumOfDigits {

	public static int digital_root(int n) {

		String str = String.valueOf(n);
		int[] splitNumber = new int[str.length()];
		System.out.println("Número recebido: " + n);

		do {
			
			for (int i = 0; i < str.length(); i++) {
				splitNumber[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			str = String.valueOf(Arrays.stream(splitNumber).sum());
			splitNumber = new int[str.length()];
			System.out.println("Soma dos dígitos: " + str);
			
		} while (str.length() > 1);

		return Integer.parseInt(str);
	}

	public static void main(String args[]) {

		System.out.println(digital_root(132189));
	}

}

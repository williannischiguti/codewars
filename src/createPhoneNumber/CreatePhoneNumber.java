package createPhoneNumber;

import java.util.Arrays;

public class CreatePhoneNumber {

	public static String createPhoneNumber(int[] numbers) {
		
		String numString = Arrays.toString(numbers).replace(", ", "").replace("[", "").replace("]", "");
		System.out.println(numString);

		String phoneNumber = "(" + numString.substring(0, 3) + ")" + " " + 
							 	   numString.substring(3, 6) + "-" + 
							 	   numString.substring(6, 10);
		
		System.out.println(phoneNumber);
		
		return phoneNumber;
		
	}

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		createPhoneNumber (numbers);
	}

}

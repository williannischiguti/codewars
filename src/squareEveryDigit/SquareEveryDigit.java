package squareEveryDigit;

public class SquareEveryDigit {

	public static int squareDigits(int n) {
		
		String numberToString = Integer.toString(n);
		String convert = "";
		
		for (int i = 0; i < numberToString.length(); i++) {
			int number = (int) Math.pow(Integer.parseInt(numberToString.charAt(i)+""), 2);
			convert += Integer.toString(number);
		}
		
		System.out.println(convert);
		
		return Integer.parseInt(convert);
	}

	public static void main(String args[]) {
		
		squareDigits(9119);
	}

}

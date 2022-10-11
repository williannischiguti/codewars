package grasshopperSummation;

import java.util.Scanner;

public class GrassHopper {

	public static int summation(int n) {

		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.print(sum);
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		summation (sc.nextInt());
		
		sc.close();
	}

}

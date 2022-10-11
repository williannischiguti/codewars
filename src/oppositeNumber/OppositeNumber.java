package oppositeNumber;

import java.util.Scanner;

public class OppositeNumber {

	public static int opposite(int number) {
		
		System.out.println((number >= 0) ? number * -1 : Math.abs(number));

		return (number >= 0) ? number * -1 : Math.abs(number);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		opposite(sc.nextInt());

		sc.close();
	}

}

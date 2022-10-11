package basicMathOperations;

import java.util.Scanner;

public class BasicOperations {

	public static Integer basicMath(String op, int v1, int v2) {
		
		if (op.charAt(0) == '+') {
			int sum = v1 + v2;
			System.out.println(sum);
			return sum;
		} else if (op.charAt(0) == '-') {
			int sub = v1 - v2;
			System.out.println(sub);
			return sub;
		} else if (op.charAt(0) == '*') {
			int mult = v1 * v2;
			System.out.println(mult);
			return mult;
		} else if (op.charAt(0) == '/') {
			int div = v1 / v2;
			System.out.println(div);
			return div;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		basicMath(sc.next(), sc.nextInt(), sc.nextInt());
		
		
		sc.close();
	}

}

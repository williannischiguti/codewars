package areTheyTheSame;

import java.util.ArrayList;
import java.util.List;

public class AreTheyTheSame {

	public static boolean comp(int[] a, int[] b) {

		if (a == null || b == null) {
			return false;
		}
		
		List<Integer> copyB = new ArrayList<Integer>();
		int count = 0;
		
		for (int i = 0; i < b.length; i++) {
			copyB.add(b[i]);
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = copyB.size() - 1; j >= 0; j--) {
				if (Math.pow(a[i], 2) == copyB.get(j)) {
					count += 1;
					copyB.remove(j);
					break;
				}
			}
		}

		return count == a.length && count == b.length;

	}

	public static void main(String args[]) {

		int[] a = { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = { 121, 14641, 20736, 361, 25921, 361, 20736, 361};

		System.out.println(comp(a, b));
	}

}

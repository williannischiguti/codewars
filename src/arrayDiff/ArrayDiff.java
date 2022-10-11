package arrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

	public static int[] arrayDiff(int[] a, int[] b) {

		List<Integer> listA = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			listA.add(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = listA.size()-1; j >= 0; j--) {
				if (b[i] == listA.get(j)) {
					listA.remove(j);
				}
			}
		}
		
		int[] c = new int[listA.size()];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = listA.get(i);
		}
		
		System.out.println(Arrays.toString(c));
		
		return c;
	}

	public static void main(String args[]) {

		arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {3, 1, 2});

	}
}

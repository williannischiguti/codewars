package estimatingAmountOfSubsets;

import java.util.HashSet;

public class EstimatingAmountOfSubsets {

	public static <T> long count(T[] elems) {

		HashSet<T> set = new HashSet<>();

		for (int i = 0; i < elems.length; i++) {
			if (!set.contains(elems[i])) {
				set.add(elems[i]);
				
			}
		}
		return (long) Math.pow(2, set.size()) - 1;

	}

	public static void main(String args[]) {

		System.out.println(count(new Integer[] { 2, 1, 1, 3, 4, 1, 2, 3, 4, 2, 3, 3, 3 }));

	}

}

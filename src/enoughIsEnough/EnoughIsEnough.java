package enoughIsEnough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		if (maxOccurrences == 0) {
			return new int[] {};
		}

		List<Integer> list = new ArrayList<Integer>();
		int count = 1;

		for (int n : elements) {
			list.add(n);
		}
	
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					count += 1;
					if (count > maxOccurrences) {
						list.set(j, null);
					}
				}
			}
			count = 1;
		}
		
		list.removeAll(Collections.singletonList(null));
		
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		return arr;

	}

	public static void main(String args[]) {

		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)));
		// 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1
	}

}

package enoughIsEnough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnoughIsEnoughAlternative {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		List<Integer> arr = new ArrayList<Integer>();
		int count = 0;

		for (int i = 0; i < elements.length; i++) {
			count = 0;
			for (int j = 0; j <= i; j++) {
				if (elements[j] == elements[i]) {
					count += 1;
				}
			}
			if (count <= maxOccurrences) {
				arr.add(elements[i]);
			}
		}

		int[] ret = new int[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			ret[i] = arr.get(i);
		}

		return ret;

	}

	public static void main(String args[]) {

		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3)));
		// 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1
	}

}

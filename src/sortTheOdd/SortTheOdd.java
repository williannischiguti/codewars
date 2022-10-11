package sortTheOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

	public static int[] sortArray(int[] array) {
	
		List <Integer> list = new ArrayList<Integer>();
		
		for (int element : array) {
			if (element %2 == 1) {
				list.add(element);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(Arrays.toString(list.toArray()));
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] %2 == 1 && list.size() == 1) {
				array[i] = list.get(count);
			}
			// 5, 3, 1, 8, 0, 1, 7, 9, 3
			if (array[i] %2 == 1 && list.size() > 1) {
				array [i] = list.get(count);
				count ++;
			}
		}
		
		return array;
	}

	public static void main(String args[]) {

		System.out.println(Arrays.toString(sortArray(new int[] {5, 3, 1, 8, 0, 1, 7, 9, 3})));
		
	}

}

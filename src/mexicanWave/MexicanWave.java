package mexicanWave;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

	public static String[] wave(String str) {

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && !((str.charAt(i)+"").equals(" "))) {
				list.add(str.substring(i, i + 1).toUpperCase() + str.substring(i + 1));
			} else if (i > 0 && i <= str.length() - 2 && !((str.charAt(i)+"").equals(" "))) {
				list.add(str.substring(0, i) + str.substring(i, i + 1).toUpperCase()
						+ str.substring(i + 1, str.length()));
			} else if (i == str.length() - 1  && !((str.charAt(i)+"").equals(" "))) {
				list.add(str.substring(0, i) + str.substring(i, str.length()).toUpperCase());
			}
		}
		
		String[] arr = new String[list.size()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		return arr;
	}

	public static void main(String args[]) {

		System.out.println(Arrays.toString(wave("two words")));

	}

}

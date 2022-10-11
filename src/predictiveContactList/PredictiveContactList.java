package predictiveContactList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredictiveContactList {

	public static List<String> predict(List<String> contacts, String keystrokes) {

		if (keystrokes.equals(""))
			return contacts;

		System.out.println("Número discado: " + keystrokes);
		List<String> buttons = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
		System.out.println("Lista dos botões: " + buttons);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < keystrokes.length(); i++) {
			sb.append("[").append(buttons.get(Integer.parseInt(keystrokes.charAt(i) + "") - 2)).append("]");
		}
		System.out.println("Resultado do StringBuilder: " + sb);

		String regex = sb.append(".*").toString();
		System.out.println("Regex: " + regex);

		List<String> result = new ArrayList<>();
		for (String contact : contacts) {
			if (contact.matches(regex))
				result.add(contact);
		}
		return result;

	}

	public static void main(String args[]) {

		String[] inputContacts = { "jones", "thompson", "brown", "taylor", "bow", "smith", "cox", "timmons" };

		System.out.println(predict(Arrays.asList(inputContacts), "269"));
	}

}

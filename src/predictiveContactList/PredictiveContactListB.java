package predictiveContactList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PredictiveContactListB {

	public static List<String> predict(List<String> contacts, String keystrokes) {

		if (keystrokes.equals("")) {
			return contacts;
		}

		Map<String, String> tel = new HashMap<String, String>();
		tel.put("2", "abc"); tel.put("3", "def"); tel.put("4", "ghi");
		tel.put("5", "jkl"); tel.put("6", "mno"); tel.put("7", "pqrs");
		tel.put("8", "tuv"); tel.put("9", "wxyz");

		System.out.println(tel.entrySet());
		System.out.println("Valores digitados: " + keystrokes);

		try {
		String str = "";

		for (int i = 0; i < keystrokes.length(); i++) {
			str += "[".concat(tel.get(keystrokes.charAt(i) + "").concat("]"));
		}

		System.out.println("Letras equivalentes: " + str);
		String regex = str.concat(".*");
		System.out.println("Regex: " + regex);

		List<String> list = new ArrayList<String>();

		for (String contact : contacts) {
			if (contact.matches(regex)) {
				list.add(contact);
			}
		}
		return list;
		
		} catch (NullPointerException e) {
			System.out.println("Dígito inválido");
			return Collections.emptyList();
		}
	}

	public static void main(String args[]) {

		String[] inputContacts = { "jones", "thompson", "brown", "taylor", "bow", "smith", "cox", "timmons" };
		
		System.out.println("Todos os contatos: " +  Arrays.toString(inputContacts));
		
		System.out.println("Contatos encontrados: " + predict(Arrays.asList(inputContacts), "269"));
	}

}

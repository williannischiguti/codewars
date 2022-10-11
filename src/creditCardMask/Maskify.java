package creditCardMask;

public class Maskify {

	public static String maskify(String str) {

		String mask = "";

		if (str.length() >= 4) {

			for (int i = 0; i < str.length() - 4; i++) {
				mask = str.substring(i).replace(str.substring(i), "#") + mask;
			}

			String maskedString = mask + str.substring(str.length() - 4, str.length());
			System.out.print(maskedString);

			return maskedString;
		} else {
			System.out.print(str);
			return str;
		}

	}

	public static void main(String[] args) {

		String str = "234928347";

		maskify(str);

	}

}

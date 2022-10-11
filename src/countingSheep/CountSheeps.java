package countingSheep;

public class CountSheeps {

	public static int countSheeps(Boolean[] arrayOfSheeps) {
		// TODO May the force be with you
		int sheepCount = 0;

		for (int i = 0; i < arrayOfSheeps.length; i++) {
			try {
				if (arrayOfSheeps[i] == true) {
					sheepCount += 1;
				}
			} catch (NullPointerException e) {
				e.getMessage();
			}

		}

		System.out.println(sheepCount);

		return sheepCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean[] array1 = { true, true, null, null, true, true, true, true, true, false, true, false, true, false,
				false, true, true, true, true, true, false, false, true, true };
		countSheeps(array1);
	}

}

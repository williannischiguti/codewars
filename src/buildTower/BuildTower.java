package buildTower;

import java.util.Arrays;

public class BuildTower {

	public static String[] towerBuilder(int nFloors) {

		String[] tower = new String[nFloors];
		for (int i = 0; i < nFloors; i++)
			tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
		System.out.println(Arrays.toString(tower));
		return tower;
	}

	public static void main(String args[]) {

		towerBuilder(6);
	}

}

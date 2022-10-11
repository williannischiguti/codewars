package schoolPaperwork;

public class SchoolPaperwork {

	public static int paperWork(int n, int m) {

		System.out.println((n < 0 || m < 0) ? 0 : n * m);
		return (n < 0 || m < 0) ? 0 : n * m;
	}

	public static void main(String args[]) {

		paperWork(5, 5);
	}
}

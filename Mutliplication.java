
public class Mutliplication {
	public static void main(String[] args) {
		for (int j = 1; j<=9; j++) {
			for (int i=1; i<=9; i++) {
				System.out.printf("%2d *%2d =%2d  ", j, i, i*j);
			}
			System.out.println();
		}
	}
}


public class Triangles {
	
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++)
				System.out.printf("* ");
			System.out.println();
		}
	    System.out.println();
		
		for (int i=5; i>=1; i--) {
			for (int j=i; j>=1; j--)
				System.out.printf("* ");
			System.out.println();
		}
		
		String str = "";
		for (int i=1; i<=5; i++) {
			str += "* ";
			System.out.printf("%10s\n", str);
		}
	    System.out.println();

	    str = "";
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++)
				str += "* ";
			System.out.printf("%10s\n", str);
			str = "";
		}
	}
}

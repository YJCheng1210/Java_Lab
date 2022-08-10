import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		// find GCD between n1 and n2
		// initially set to gcd
	
		int gcd = 1;
	
		for (int i = 1; i <= n1 && i <= n2; ++i) {
		// check if i perfectly divides both n1 and n2
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);	
	}
}
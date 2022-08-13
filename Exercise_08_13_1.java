import java.util.Scanner;

public class Exercise_08_13_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();		
		long factorial = 1;
		for(int i = 1; i <= num; ++i) {
			// factorial = factorial * i;
			factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
	}	
}
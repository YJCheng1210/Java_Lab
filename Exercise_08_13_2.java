import java.util.Scanner;

public class Exercise_08_13_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double base = scn.nextDouble();
		int num = scn.nextInt();
		double result = base;
		for (int i=1; i<num; i++)
			result *= base;
	
		System.out.printf("Result = %f", result);
	}
}
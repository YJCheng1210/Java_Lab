import java.util.Scanner;
public class Lab_01_Guess_Number {
	public static void main(String[] args) {
		int s = (int) (Math.random()*100);
		int low = 0, high = 99;
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.printf("(%d, %d)?", low, high);
			
			int g = input.nextInt();
			
			if (g > high || g < low) {
				System.out.println("Out of range. Try again.");
				continue;
			}
			if (g < s) {
				System.out.println("Too low. Try again.");
				low = g + 1;
			} else if (g > s) {
				System.out.println("Too high. Try again.");
				high = g - 1;
			}
			
			if (g == s) {
				System.out.print("Bigo!");
				break;
			}
			
			if (low == high ) {
				System.out.println("You lose.");
				break;
			}
			
		}
	}
}

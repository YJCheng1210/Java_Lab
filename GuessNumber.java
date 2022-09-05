import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random r = new Random();

		int low = 0;
		int high = 99;
		int result = r.nextInt(high-low) + low;
		
		while (true) {
			System.out.println("("+ low+ "," + high + ")?");
			Scanner scn = new Scanner(System.in);
			int guess = scn.nextInt();

			if ((guess < low) || (guess > high)) {
				System.out.println("Out of Rannge, Try again?");
				continue;
			}

			if (guess == result) {
				System.out.println("Bingo");
				break;
			} else {
				if (guess < result) 
					low = guess++;
				else
					high = guess--;
			}
			if (low==high) {
				System.out.print("You lose!");
				break;
			}
			scn.close();
		}
	}
}

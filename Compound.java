
public class Compound {
	public static void main(String[] args) {
		
		double balance = 100.0, goal = 200.0, r = 15;
		int holding_years = 0;
		
		while(balance < goal) {
			balance *= (1 + r / 100);
			holding_years++;
		}
		System.out.println("BALANCE = " + Math.round(balance));		
		System.out.println("YEARS = " + holding_years);
	}
}

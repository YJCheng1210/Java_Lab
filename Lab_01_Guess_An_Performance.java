public class Lab_01_Guess_An_Performance {
	public static void main(String[] args) {
		double N = 10000.0;
		int M = 0;
		
		for (int i = 1; i <= N; i++) {
			int s = (int) (Math.random()*100);
			int low = 0, high = 99;

			while (true) {
//				int g =  (int) (Math.random()*(high-low+1));
				int g = (int)((high+low)/2);

				if (g == s) {
					M++;
					break;
				} else {
					if (g < s) low = g + 1;
					else high = g - 1;
				}
				if (low == high ) {
					break;
				}
			}
		}
		System.out.printf("The possibility = %4.2f", (M/N*100));
	}
}

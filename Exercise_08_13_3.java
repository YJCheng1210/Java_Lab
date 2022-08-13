public class Exercise_08_13_3 {
	public static void main(String[] args) {
		double ans = 0;
		
		for (int i=0; i<=10000; i++) 
			ans += Math.pow(-1, i) / (2*i+1);
		ans *= 4;
		
		System.out.println("Result = " + ans);
	}
}

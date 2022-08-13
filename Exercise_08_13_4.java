public class Exercise_08_13_4 {
	public static void main(String[] args) {
		double x, y;
		int times = 0;
		
		for (int i=0; i<1000000; i++) {
			x = Math.random();
			y = Math.random();
			if (x*x+y*y <= 1) 
				times ++;
		}
		System.out.println("PI = " + (4.0*times/1000000));
	}
}

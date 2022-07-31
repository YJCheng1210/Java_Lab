
public class ForEachDemo {
	public static void main(String[] args) {
		// Create an array with 10 integers 
		int[] a = new int[10];
		// Initialize the elements of array
		int v = 10;
		for (int i = 0; i < 10; i++) {
			a[i] = v--;
		}
		// Print every element in the array with a for loop
		for (int i : a) {
			System.out.println(i);
		}
	}
}

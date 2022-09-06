import java.util.Arrays;

public class SortCompare {

	public static int[] BubbleSort(int[] array) {
    	int temp;
    	for (int i=array.length-1; i>=1; i--) {
    		for (int j=0; j<i; j++) {
    			if (array[j] > array[j+1]) {
    				temp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = temp;
    			}
    		}
    	}
    	return array;
    }
	
    public static int[] InsertionSort(int[] array) {
        int n, j;
        for (int i = 1; i < array.length; ++i) {
            n = array[i];
            for (j = i-1; j >= 0 && array[j] > n; --j)
                array[j+1] = array[j];
            array[j+1] = n;
        }
        return array;
    }
	    
    public static int[] SelectionSort(int[] array) {
    	int max_index, temp;
    	for (int i=array.length-1; i>0; i--) {
    		max_index = 0;
    		for (int j=1; j<=i; j++) {
    			if (array[max_index] < array[j]) {
    				max_index= j;
    			}
    		}
    		temp = array[max_index];
    		array[max_index] = array[i];
    		array[i] = temp;
    	}
    	return array;
    }

	public static void Compare(int numbers) {
		int[] array = new int[numbers];
		
		long start_t, end_t;
		double duration;
		
		for (int i=0; i<numbers; i++) 
			array[i] = (int)(Math.random() * numbers);
		start_t = System.nanoTime();
		array = BubbleSort(array);
		end_t = System.nanoTime();
		duration = (end_t - start_t)/1000000.0;
		System.out.println("BubbleSort:\t" + duration);

		for (int i=0; i<numbers; i++) 
			array[i] = (int)(Math.random() * numbers);
		start_t = System.nanoTime();
		array = InsertionSort(array);
		end_t = System.nanoTime();
		duration = (end_t - start_t)/1000000.0;
		System.out.println("InsertionSort:\t" + duration);

		for (int i=0; i<numbers; i++) 
			array[i] = (int)(Math.random() * numbers);
		start_t = System.nanoTime();
		array = SelectionSort(array);
		end_t = System.nanoTime();
		duration = (end_t - start_t)/1000000.0;
		System.out.println("SelectionSort:\t" + duration);

		for (int i=0; i<numbers; i++) 
			array[i] = (int)(Math.random() * numbers);
		start_t = System.nanoTime();
		Arrays.sort(array);
		end_t = System.nanoTime();
		duration = (end_t - start_t)/1000000.0;
		System.out.println("Arrays.sort():\t" + duration);
	}	    
    
	public static void main(String[] args) {
		System.out.println(" 1000 times----------------------");
		Compare(1000);
		System.out.println(" 2000 times----------------------");
		Compare(2000);
		System.out.println(" 4000 times----------------------");
		Compare(4000);
		System.out.println(" 8000 times----------------------");
		Compare(8000);
		System.out.println("16000 times----------------------");
		Compare(16000);
		System.out.println("32000 times----------------------");
		Compare(32000);
		System.out.println("64000 times----------------------");
		Compare(64000);
	}

}

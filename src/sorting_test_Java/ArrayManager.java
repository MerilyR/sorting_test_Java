package sorting_test_Java;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayManager {
	static int[] generateArray (int length, int from, int to){
		int[] arr = new int[length];
		for (int i = 0; i<length; i++){
			int random;
			//int counter = 0;
			do {
				//counter ++;
				random = ThreadLocalRandom.current().nextInt(from, to);
			} while (contains(Arrays.copyOfRange(arr, 0, i), random));
			arr[i] = random;
			//if (counter > 1) System.out.print("("+counter+")");
		}
		return arr;	
	}
	
	private static boolean contains(int[] array, int target){
		for (int i: array){
			if (i == target)
				return true;			
		}
		return false;
	}
}

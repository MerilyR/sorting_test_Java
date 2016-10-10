package sorting_test_Java;


import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		long start, end;
		for (int i = 0; i<5; i++ ) {
			int[] array = ArrayManager.generateArray(2000, 0, 65000);
			System.out.print("Unsorted: ");
			for (int a: array)
				System.out.print(a+"; ");
			System.out.println("");
					
			int[] copyOfArray = array.clone();
			start = System.nanoTime();
			Arrays.sort(copyOfArray);
			end = System.nanoTime();
			System.out.printf("Arrays.sort()      Time: %.2f microseconds\n",(end-start)/1000.0);
//			System.out.print("  Sorted: ");
//			for (int b: copyOfArray)
//				System.out.print(b+"; ");
//			System.out.println("");

			int[] copyOfArray2 = array.clone();
			start = System.nanoTime();
			IntSorter.bubbleSort(copyOfArray2);
			end = System.nanoTime();
			System.out.printf(" -vs- bubbleSort() Time: %.2f microseconds\n",(end-start)/1000.0);
//			System.out.print("  Sorted: ");
//			for (int c: copyOfArray2)
//				System.out.print(c+"; ");
//			System.out.println("\n");
			
			int[] copyOfArray3 = array.clone();
			start = System.nanoTime();
			IntSorter.heapSort(copyOfArray3);
			end = System.nanoTime();
			System.out.printf(" -vs- heapSort()   Time: %.2f microseconds\n\n",(end-start)/1000.0);
//			System.out.print("  Sorted: ");
//			for (int c: copyOfArray3)
//				System.out.print(c+"; ");
//			System.out.println("\n");
		}
		
		
	}

}

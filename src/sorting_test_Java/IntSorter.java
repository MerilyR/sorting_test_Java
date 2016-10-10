package sorting_test_Java;

import java.util.Arrays;

public class IntSorter {
	static void sort(int[] array){
		Arrays.sort(array);
	}
	
	static void bubbleSort(int[] array){
		int n = array.length;
		int tmp;
		int newn;
		do {
			newn = 0;
			for (int j = 1; j<n-1; j++){
				if (array[j-1] > array[j]){
					tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
					newn = j;
				}
			}
			n = newn;
		} while (n != 0);
	}
	
	static void heapSort(int[] array){
		heapify (array, array.length);
		int end = array.length - 1;
		//children are 2*i+1 and 2*i+2
		while (end > 0){
			swap (array, end, 0);
			end = end - 1;
			siftDown (array, 0, end);
		}
	}
	
	private static void heapify (int[] array, int count) {
		int start = count / 2 - 1;
		while (start >= 0) {
			siftDown (array, start, count-1);
			start = start -1;
		}
	}
	
	private static void siftDown (int[] array, int start, int end) {
		int root = start;
		while (root*2+1 <= end){
			int child = root * 2 + 1;
			int swap = root;
			if (array[swap] < array[child])
				swap = child;
			if (child+1 <= end && array[swap]< array[child+1])
				swap = child+1;
			if (swap != root){
				swap (array, root, swap);
				root = swap;
			}
			else
				return;		
		}
	}
		
	private static void swap(int[] array, int firstindex, int secondindex){
		int tmp = array[firstindex];
		array[firstindex] = array[secondindex];
		array[secondindex] = tmp;
	}
}

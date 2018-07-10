package com.test;

public class QuickSort {

	
	public static void main(String[] args) {
		
		int array[] = {10, 4, 2, 7, 3, 8, 9, 1, 6, 5};
		//int array[] = {3, 10, 7, 13, 2, 8, 6, 18, 9, 1, 5, 12, 15};
        int size = array.length;
        print(array);
 
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, size-1);
 
        System.out.println("sorted array");
        print(array);
	}
	
	private void sort(int[] array, int low, int high) {
		
		if(low<high) {
			
			//partition
			int mid = partition(array, low, high);
			System.out.println("partition=" + mid + " value=" + array[mid]);
			
			//sort left
			sort(array, low, mid-1);
			
			//sort right
			sort(array, mid+1, high);
		}
	}
	
	private int partition(int array[], int low, int high) {
		
		//check exit low high
		
		//select pivot
		int pivot = array[high];
		System.out.println("pivot=" + pivot);
		
		//set pivot position
		int position = low - 1;
		System.out.println("position=" + position);
		
		//iterate array to compare with pivot
		for (int j = low; j < high; j++) {
			
			System.out.println("~~~~~~~~~~~~~~~~~~");
			
			int current = array[j];
			System.out.println("j=" + j + " current=" + current + " pivot=" + pivot);
			
			//compare current to pivot
			if(current<=pivot) {
				
				position++;//increment position
				
				//swap
				System.out.println("swap=" + array[position] + " " + array[j]);
				int temp = array[position];
				array[position] = array[j];
				array[j] = temp;
				
				print(array);
			} else {
				//do nothing
				System.out.println("do nothing");
			}
		}
		
		//swap pivot to its position
		int temp = array[high];
		array[high] = array[position+1];
		array[position+1] = temp;
		System.out.println("swap pivot=" + array[position+1] + " " + array[high]);
		print(array);
		
		return position+1;
	}
	
	private static void print(int[] array) {
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i] + " ");
		}
		System.out.println("array= " + sb.toString());
	}
	
}

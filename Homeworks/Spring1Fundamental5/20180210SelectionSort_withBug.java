package Homework;

public class SelectionSort {
	public static void main(String[] args){
		int[] arr = {4,6,1,3,8,7,9,0,2,5};
		selection_sort(arr);
	}
	
	public static void selection_sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			int min = arr[0];
			int min_index = 0;
			for(int j = i ; j < arr.length; j++){
				if(arr[j] < min){
				min = arr[j];
				min_index = j;
				}
			}
			swap(arr, arr[i], arr[min_index]);
		}
		
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n]+" ");
		}
	}
	
	public static int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}

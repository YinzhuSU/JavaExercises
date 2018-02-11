package Homework;

public class SelectionSort {
	public static void main(String[] args){
		int[] arr = {4,6,1,3,8,7,9,0,2,5};
		selection_sort(arr);
	}
	
	public static void selection_sort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			int min = arr[i];  //不可以是min = arr[0]!因为i增加了，每次循环还是把min设为数组的第0个元素！
			int min_index = i; //同上
			for(int j = i; j < arr.length; j++){
				if(arr[j] < min){
				min = arr[j];
				min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n]+" ");
		}
	}
}
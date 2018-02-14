package Homework;

public class MergeSort {
	public static void main(String[] args){
		int[] arr = {4,6,1,3,7,0,2,5};
		mergesort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n] + " ");
		}
	}
	
	public static int[] mergesort(int[] arr){
		if(arr == null || arr.length == 0 ){ //arr.length == 1??
			return arr;
		}
		int[] helper = new int[arr.length];

		recur(arr, 0, arr.length-1,helper);
		return arr;	
	}
	
	public static void recur(int[] arr, int left, int right, int[] helper){ //why return type cannot be int[]?
		if(left == right){ //why cannot be ==
			return;  //why cannot return int[]??
		}


		int mid = left + (right - left)/2;
		
		recur(arr, left, mid, helper);
		recur(arr, mid+1, right, helper);
		merge(arr, left, mid, right, helper);
        return;
	}
	
	public static int[] merge(int[] arr, int left, int mid, int right, int[] helper){
		for(int n = 0; n < arr.length; n++){
			helper[n] = arr[n];
		}
		int index = left; //
		int rightindex = mid+1;
		while(left <= mid && rightindex <= right){
			if(helper[left] <= helper[rightindex]){
				arr[index++] = helper[left++];
			}
			else{
				arr[index++] = helper[rightindex++];
			}
		}
		while(left <= mid){
			arr[index++] = helper[left++];
		}
		//不用写右边的了				
		return arr;
	}
	
}
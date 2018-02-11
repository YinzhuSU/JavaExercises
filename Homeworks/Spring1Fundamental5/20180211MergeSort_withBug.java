package Homework;

public class MergeSort {
	public static void main(String[] args){
		int[] arr = {4,6,1,3,7,0,2,5};
		merge_sort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n] + " ");
		}
	}
	
	public static void merge_sort(int[] arr){
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length/2]; //当array.length为奇数，此处改为arr.length/2 + arr.length%2
		for(int i = 0; i < left.length; i++){
			left[i] = arr[i];  
		}
		for(int j =0; j < right.length; j++){
			right[j] = arr[arr.length/2 + j];
		}
		merge(left, right);
		merge_sort(left);
		merge_sort(right);
	}
	
	public static int[] merge(int[]left, int[]right){
		int[] mergedarr = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(k < mergedarr.length){
			if(i < left.length && j < right.length){
				if(left[i] <= right[j]){
					mergedarr[k] = left[i];
					i++;
					k++;
				}
				if(right[j] < left[i]){
					mergedarr[k] = right[j];
					j++;
					k++;
				}
			}
			if(i >= left.length){
				mergedarr[k] = right[j];
				j++;
				k++;
			}
			if(j >= right.length){
				mergedarr[k] = left[i];
				i++;
				k++;
			}
		}
		return mergedarr;	
	}
	
}
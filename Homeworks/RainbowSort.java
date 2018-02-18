package Homework;

public class RainbowSort {
	public static void main(String[] args){
		int[] arr = {0,1,-1,0,1,1,-1,-1,-1,0,-1,1,1,1};
		rainbowsort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n] + " ");
		}
	}
	
	public static int[] rainbowsort(int[] arr){
		if(arr == null || arr.length <= 1){
			return arr;
		}
		int i = 0;
		int j = 0;
		int k = arr.length - 1;
		
		int max = max(arr);
		int min = min(arr);
		
		while(j <= k){
			if(arr[j] == min){
				swap(arr, i, j);
				i++;
				j++; 
			}else if(arr[j] == max){ //如果只用if，就会在上一个判断实现后再进行一次判断!
				swap(arr, j, k);
				k--;
			}
			else{
				j++;
				}
			}	
		return arr;
	}	

	private static int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
	}
	
	private static int max(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	private static int min(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	

}

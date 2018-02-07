package Homeworks;

public class ReverseArray {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] newarr = reverse(arr);
		for(int j = 0; j < arr.length; j++){
			System.out.print(newarr[j]+" ");
		}
		
	}
	
	public static int[] reverse(int[] arr){
		int[] newarr = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			newarr[i] = arr[arr.length-i-1];//注意这里的-1！
		}
		return newarr;
	}
}

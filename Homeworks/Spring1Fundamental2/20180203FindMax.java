package Laioffer;
public class Homework {
	public static void main(String[] args){
		int[] arr = {3,6,2,7,11,54};
		int max = arr[0];
		for(int i = 0 ; i<arr.length ; i++){
		//for(int i : arr){ //why ArrayIndexOutOfBoundsException
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
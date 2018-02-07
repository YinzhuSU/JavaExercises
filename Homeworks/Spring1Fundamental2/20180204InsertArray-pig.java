package Homeworks;

public class InsertArray {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		insert(arr, 6, 61);
	}
	
	public static void insert(int[] oriarr, int position, int content){
		if(position < 0 || position > oriarr.length-1){
			System.out.println("position is wrong");
		}
		else{
			int[] newarr = new int[oriarr.length+1];
			for(int i = 0; i < oriarr.length+1; i++){
				if(i < position){
					newarr[i] = oriarr[i];
				}
				if(i == position){
					newarr[i] = content;	
				}
				if(i > position){
					newarr[i] = oriarr[i-1];
				}
			}
			for(int j = 0; j < newarr.length; j++){
				System.out.print(newarr[j]+" ");
			}
		}
	}
}

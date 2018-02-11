package PracticeLC;

public class TwoSum {
	public static void main(String[] args){
		int[] num = {2, 2, 7, 11, 15, 2};
		int target = 18;
		System.out.println(twosum(num, target));
	}
	
	public static String twosum(int[] num, int target){

		int i;
		int j;
		String m; //why there's a warning?
		for(i = 0; i < num.length-1; i++){
			for(j = i + 1; j < num.length; j++){
				if(target - num[i] == num[j]){
					return m = "The first indice is "+i+", the second indice is "+j+".";
				}
				continue;
			}
		}
		return m = "There are no suitable two-numbers in the array.";
	}
}


package PracticeLC;

public class TwoSum {
	public static void main(String[] args){
		int[] num = {2, 2, 7, 11, 15, 2};
		int target = 9;
		twosum(num, target);
		System.out.println(num.length);
	}
	
	public static void twosum(int[] num, int target){
		int m = 0;
		int i;
		int j;
		for(i = 0; i < num.length-1; i++){		//why there's a warning?
			for(j = i + 1; j < num.length; j++){
				if(target - num[i] == num[j]){
					m = 1;
					System.out.println("The first indice is "+i+", the second indice is "+j+".");
					break; //how to break two layers of for-loop?
				}
				continue;
			}
			
			if(m == 1){
				break;
			}
			else{
				System.out.println("There are no suitable two-numbers in the array.");
				break;
			}
		}
	}
}

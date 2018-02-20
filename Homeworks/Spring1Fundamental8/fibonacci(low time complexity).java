package Homework;

public class Test {
	public static void main(String[] args){
		int K = 7;
		System.out.println(fibonacci(K));
	}
	
	private static long fibonacci(int K){
		int[] array = new int[K+1];
		array[0] = 0;
		array[1] = 1;
		for(int i = 2; i < K+1; i++){
			array[i] = array[i-1]+array[i-2];
		}
		return array[K];
		
	}
}

	

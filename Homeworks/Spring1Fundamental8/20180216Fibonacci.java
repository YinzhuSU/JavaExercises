package Homework;

public class Fibonacci {
	public static void main(String[] args){
		int K = 45;
		System.out.println(fibonacci(K));
	}
	
	public static long fibonacci(int K){
		if(K < 0){
			return 0;
		}else if(K == 0){
			return 0;
		}else if(K == 1){
			return 1;
		}else{
			return fibonacci(K-1) + fibonacci(K-2);
		}
	}
}
//The time complexity of his algorithm is O(2^n), too slow
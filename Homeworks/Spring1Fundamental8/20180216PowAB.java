package Homework;

public class PowAB {
	public static void main(String[] args){
		int a = 1;
		int b = 566666666;
		System.out.println(power(a, b));
	}
	
	public static long power(int a, int b){
		if(a == 0){
			return 0;
		}else if(a == 1){
			return 1;
		}else{
			if(b < 0){
				return 0;
			}else if(b == 0){
				return 1;
			}else{
				long helper = power(a, b/2);
				if(b%2 == 0){
					return helper * helper;
				}else{
					return helper * helper * a;
					}
				}
			}
	}
}
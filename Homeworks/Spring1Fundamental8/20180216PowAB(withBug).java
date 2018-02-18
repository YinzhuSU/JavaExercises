package Homework;

public class PowAB {
	public static void main(String[] args){
		int a = -4;
		int b = 3;
		System.out.println(power(a, b));
	}
	
	public static long power(int a, int b){
		if(a == 0){
			return 0;
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
					if(a >= 0){
						return helper * helper * a;
					}else{
					return 1/(helper * helper * a);
					}
				}
			}
		}	
	}
}
// I missed up 2^(-3) with (-2)^3, and the result is wrong when a < 0.

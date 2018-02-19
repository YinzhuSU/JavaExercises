package Homework;

public class PowFactorial {
	public static void main(String[] args){
		long a = 2;
		long b = 4;
		System.out.println(PowFactorial(a, b));
	}
	
	public static long PowFactorial(long a, long b){
		if(a == 0){
			return 0;
		}else if (a == 1){
			return 1;
		}else{
			return PowFactorial(power(a,a), b - 1) ;
		}
	}
	
	public static long power(long a, long b){
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

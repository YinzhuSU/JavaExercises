package Homeworks;
class Test {
	public static void main(String[] args){
		for(int even = 4;even < 10000; even += 2){
			goldbach(even);
		}
	}
	
	public static boolean prime(int n){
		if(n > 3 && n % 2 == 0){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(n) ; i+=2){
			if(n % i != 0){
				continue;
			}
			return false;
		}
		return true;
	}
	
	public static boolean goldbach(int even){
		for(int j=2; j < even/2; j++){
			if(prime(j) && prime(even-j)){
				break;
			}
			continue;
		} 	
		System.out.println(even+" Gold");
		return true;
	}
}

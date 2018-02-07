package Laioffer;

public class Homeworks {
	public static void main(String[] args){
		int[][] matrix1 = {{1,4,5,9},{2,9,8,-4},{8,1,-5,6},{4,22,5,10}};
		trace(matrix1);
	}
	
	public static void trace(int[][] matrix){
		if(matrix.length != matrix[0].length || matrix.length < 1){
			System.out.println("The input matrix should be a square matrix!");
		}
		int Sigma = 0;
		for(int i = 0; i < matrix.length; i++){
			Sigma += matrix[i][i];
		}
		System.out.println(Sigma);
	}

}

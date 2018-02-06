package Laioffer;

public class SumOfMatrix {
	public static void main(String[] args){
		int[][] matrix1 = {{1,2,3},{3,-3,5}};
		int[][] matrix2 = {{2,4,-2},{3,7,-3}};
		sumofmatrix(matrix1, matrix2);
	}

	public static void sumofmatrix(int[][] matrix1, int[][]matrix2){
		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
			System.out.println("The two matrix must be same size!");
		}
		int[][] newmatrix = new int[matrix1.length][matrix1[0].length];
		for(int i = 0; i < matrix1.length; i++){
			for(int j =0; j < matrix1[0].length; j++){
				newmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		for(int m = 0; m < newmatrix.length; m++){
			for(int n =0; n < newmatrix[0].length; n++){
				System.out.print(newmatrix[m][n]+" ");
			}
			System.out.println(" ");
		}
	}
}

package Homework;

public class SearchSortedMatrix {
	
	public static void main(String[] args){
		int[][] matrix = new int[][]{{-1,2,3},{3,5,7},{9,10,12}};
		int[] answer = new int[2];
		answer = searchsortedmatrix(matrix, 9);
		for(int i = 0; i < 2; i++){
			System.out.print(answer[i] + " ");
		}
		
	}
	
	public static int[] searchsortedmatrix(int[][] matrix, int target){
		int m = matrix.length;
		int n = matrix[0].length;
		int[] ret = new int[]{-1,-1};
		if(matrix == null || m == 0 || n == 0){
			return ret;
		}
		
		int left = 0;
		int right = m * n - 1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(matrix[mid/n][mid%n] == target){
				ret[0] = mid/n;
				ret[1] = mid%n;
				return ret;
			}else if(matrix[mid/n][mid%n] < target){
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		return ret;
	}

}

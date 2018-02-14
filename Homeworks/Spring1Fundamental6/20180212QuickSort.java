package Homework;
import java.util.Random;
public class QuickSort {
	static Random random = new Random();//创建随机对象
	public static void main(String[] args){
		int[] arr = {4,6,1,3,7,0,2,5};
		quicksort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n] + " ");
		}
	}
	
	public static int[] quicksort(int[] arr){

		if(arr == null || arr.length == 0){
			return arr;
		}
		
		recur(arr, 0, arr.length-1);		
		return arr;
	}
	
	public static void recur(int[] arr, int left, int right){
		if(left >= right){ //why not ==??
			return;
		}
		int p = position(arr, left, right);
		
		recur(arr, left, p-1);
		recur(arr, p+1, right);
	}
	
	public static int position(int[] arr, int left, int right){
		int pivotpos = random.nextInt(right - left) + left;
		int pivot=arr[pivotpos];
		//int times = 0; 不能用这个所谓的times和arr.length来计数，因为每次recur范围的大小都不一样
		swap(arr, pivotpos,right);
		int i=left;
		int right1 = right - 1;
		while(right1 >= i){
			if(arr[i] < pivot){
				i++;
			}else if(arr[right1] >= pivot){
				right1--;
			}
			else{ //能否直接写成else？
				swap(arr, i, right1);
				i++;
				right1--;
			}
		}
		swap(arr, i, right); //此时left所指的数组元素就是这一轮的pivot的该有的位置
		
		return i;
	}
	
	public static int[] swap(int[] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}

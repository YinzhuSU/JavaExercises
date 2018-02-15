package p1;
import java.util.Random;
public class Test {
	static Random random = new Random();//创建随机对象
	public void main(String[] args){
		int[] arr = {4,6,1,3,7,0,2,5};
		quicksort(arr);
		for(int n = 0; n < arr.length; n++){
			System.out.print(arr[n] + " ");
		}
	}
	
	public void quicksort(int[] arr){

		if(arr == null || arr.length == 0){
			return;
		}
		
		quicksort(arr, 0, arr.length-1);		
		return;
	}
	
	private void quicksort(int[] arr, int left, int right){
		if(left >= right){ //why not ==?? 存在left>right的情况，比如pivot取到最左边的值，看下面第一个quicksort，l可能等于left，那么l-1就小于left
			return;
		}
		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left + 1); //为什么这里是要+1的？？
		swap(arr, pivotIndex, right);
		
		int l = left, r = right - 1;
		while(l <= r){
			if(arr[l] < arr[right]){
				l++;
			}else{
				swap(arr, l ,r);
				r--;
				}
			}
		swap(arr, right, l);
		quicksort(arr, left, l - 1);
		quicksort(arr, l + 1, right);
		}
	
	
	private void swap(int[]arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;	
	}
}
	
	

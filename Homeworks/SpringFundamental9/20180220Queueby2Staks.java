package Homework;
import java.util.*;

public class Queueby2Staks {
	public Integer poll(){
		if(stackout.isEmpty()){
			if(stackin.isEmpty()){
				return null;
			}else{
				shuffle(stackin, stackout);
				return stackout.pop();
			}
		}else{
			return stackout.pop();
		}
	}
	
	Deque<Integer> stackin = new LinkedList<>();
	Deque<Integer> stackout = new LinkedList<>();
	public Integer peek(){
		if(stackout.isEmpty()){
			if(stackin.isEmpty()){
				return null;
			}else{
				shuffle(stackin, stackout);
				return stackout.peek();
			}
		}else{
			return stackout.peek();
		}
	}
	
	public void offer(Integer input){
		stackin.push(input);	
		return;
	}
	
	public void shuffle(Deque<Integer> stackin, Deque<Integer> stackout){
//		while(!stackin.isEmpty()){          //不强调次数，而强调条件的时候，最好用while循环
//			stackout.push(stackin.pop());
//		}
//		for(int i = 0; i < stackin.size(); i++){ //这样写之所以会错，是因为每次循环之后，stackin.size()都会变，
//			stackout.push(stackin.pop());        //都会因为pop出去了一个数而小1，所以如果想要这样写，
//		}										 //必须要着进入循环之前把stackin的size()值赋给一个新的变量！
		int length = stackin.size();
		for(int i = 0; i < length; i++){
			stackout.push(stackin.pop());
		}
		return;
	}
	
	public int size(){
		int size = stackin.size() + stackout.size();
		return size; 
	}
	
	public boolean isEmpty(){
		if(stackin.isEmpty() && stackout.isEmpty()){
			return true;
		}else{
			return false;
		}
	}

}

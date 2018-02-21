package Homework;
import java.util.*;

public class StackMin {

	public int pop() {
	    if(stack.isEmpty()){
	      return -1;
	    }else if(stack.peek() > minstack.peek()){
	      return stack.pop();
	    }else{
	      minstack.pop();
	      return stack.pop();
	  }
	}
	  
	  Deque<Integer> stack = new LinkedList<>();
	  Deque<Integer> minstack = new LinkedList<>();
	  
	  public int top() {
		if(stack.isEmpty()){
			return -1;
		}else{
	    return stack.peek();
		}
	  }
	  
	  public void push(int element) {
	    if(element <= minstack.peek() || stack.isEmpty() || minstack.isEmpty()){ //为什么这样写不行？
	      stack.push(element);
	      minstack.push(element);
	    }else{
	      stack.push(element);
	    }
	  }
	  
	  public void push2(int element) {
		    if(stack.isEmpty()){
		      stack.push(element);
		      minstack.push(element);
		    }else if(element <= minstack.peek()){
		      stack.push(element);
		      minstack.push(element);
		    }else{
		      stack.push(element);
		    }
		  }
	  
	  public int min() {
	    if(stack.isEmpty()){
	      return -1;
	    }else{
	      return minstack.peek();
	    }
	  }

}

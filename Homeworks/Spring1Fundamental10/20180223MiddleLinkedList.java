package Homework;

public class MiddleLinkedList {
	 public class ListNode {
		    public int value;
		    public ListNode next;
		    public ListNode(int value) {
		      this.value = value;
		      next = null;
		    }
		  }
	 
	 public static void main(String[] args){
		 
	 }
	 public static ListNode middleNode(ListNode head) {
		    if(head == null || head.next == null){
		        return head;
		      }else{
		        ListNode slow = head;
		        ListNode fast = head;
		        while(fast.next != null && fast.next.next != null){
		          slow = slow.next;
		          fast = fast.next.next;
		        }
		        return slow;
		      }
		  }
	 
	
}

package easy;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        Solution206 solution = new Solution206();
        ListNode result = solution.reverseList(list);
        System.out.println(result);
        while (result != null) {
        	System.out.println(result.val);
        	result = result.next;
        }
	}

}

class Solution206 {
    public ListNode reverseList(ListNode head) {
    	ListNode prev = null;
    	ListNode current = head;
    	while (current != null) {
        	ListNode post = current.next; //先儲存下一個
        	current.next = prev; //指向往回
        	prev = current; //移到下一個
        	current = post; 
        }
    	return prev;
    }
}

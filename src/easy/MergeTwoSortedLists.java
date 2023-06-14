package easy;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// 建立 list1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // 建立 list2
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        
        Solution21 solution21 = new Solution21();
        ListNode result = solution21.mergeTwoLists(list1, list2);
        ListNode current = result;
        while (current != null) {
        	System.out.println(current.val);
        	current = current.next;
        }
	}

}

class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // 虛擬節點
        ListNode current = dummy; // 目前節點
        
    	while (list1 != null && list2 != null) {
        	if (list1.val <= list2.val) {
        		current.next = list1;
        		list1 = list1.next;
        	} else {
        		current.next = list2;
        		list2 = list2.next;
        	}
        	current = current.next;
        }
    	
    	if (list1 != null) {
    		current.next = list1;
    	}
    	
    	if (list2 != null) {
    		current.next = list2;
    	}
    	
    	return dummy.next;
    }
}


class ListNode{
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k = 4;

//		Solution215 solution = new Solution215();
		Solution215_2 solution = new Solution215_2();
		System.out.println(solution.findKthLargest(nums, k));
		
	}

}

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();  
        for (int i : nums) {
        	list.add(i);
        }
        Collections.sort(list);
        return (int) list.get(list.size() - k);
    }
}

class Solution215_2 {
    public int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> queue = new PriorityQueue<>(); // PriorityQueue升序排序
        for (int i : nums) {
        	queue.offer(i);
        }
        for (int i = 0; i < nums.length - k; i++) {
        	queue.poll();
        }
        return queue.peek();
    }
}
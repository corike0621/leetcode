package easy;

import java.util.List;
import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		Solution27 solution = new Solution27();
		System.out.println(solution.removeElement(nums, val));

	}

}

class Solution27 {
    public int removeElement(int[] nums, int val) {
    	List<Integer> list = new ArrayList<>();
        for (int i : nums) {
        	if (i != val) {
        		list.add(i);
        	}
        }
        for(int i = 0; i < list.size(); i++) {
        	nums[i]= list.get(i); 
        }
        return list.size();
    }
}

class Solution27_2 {
    public int removeElement(int[] nums, int val) {
        int temp;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] != val){
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        return count;
    }
}

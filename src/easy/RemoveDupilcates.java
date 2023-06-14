package easy;

public class RemoveDupilcates {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Solution26 solution = new Solution26();
		System.out.println(solution.removeDuplicates(nums));
	}
}


class Solution26 {
    public int removeDuplicates(int[] nums) {
    	int count = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[count] != nums[i] ) {
        		count++;
        		nums[count] = nums[i];
        	}
        }
        return count + 1;
    }
}
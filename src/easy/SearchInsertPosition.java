package easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,7};
		int target = 6;
		
		Solution35_2 solution = new Solution35_2();
		System.out.println(solution.searchInsert(nums, target));

	}

}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
    	if (target > nums[nums.length -1]) {
    		return nums.length;
    	} else if (target < nums[0]){
    		return 0;
    	} else {    		
    		for (int i = 0; i < nums.length; i++) {
    			if (target > nums[i] && target < nums[i+1]) {
    				return i + 1;
    			} else if (target == nums[i]) {
    				return i;
    			} 			
    		}
    	}
    	return -1;
    }
}

class Solution35_2 {
    public int searchInsert(int[] nums, int target) {
    	int i = 0;
    	while (i < nums.length) {
    		if (target == nums[i]) {
    			System.gc(); //清理垃圾
    			return i;
    		} else if (target < nums [i]) {
    			System.gc(); //清理垃圾
    			return i--;
    		}
    		i++;
    	}
    	System.gc(); //清理垃圾
    	return i;
    }
}



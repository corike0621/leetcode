package easy;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		Solution66 solution = new Solution66();
//		Solution66_2 solution = new Solution66_2();
		for(int i : solution.plusOne(digits)) {
			System.out.println(i);
		}
		System.out.println(solution.plusOne(digits));
	}

}

class Solution66 {
    public int[] plusOne(int[] digits) {
    	for (int i = digits.length - 1; i >= 0; i--) {
    		if (digits[i] == 9) {
    			digits[i] = 0;
    		} else {
    			digits[i] += 1;
    			return digits;
    		}
    	}
    	
    	int[] result = new int[digits.length + 1];
    	result[0] = 1;
    	return result;
    }
}

class Solution66_2 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        
        return digits;
    }
}
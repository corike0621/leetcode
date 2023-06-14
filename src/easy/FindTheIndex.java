package easy;

public class FindTheIndex {

	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "ee";
		
		Solution28 solution = new Solution28();
		System.out.println(solution.strStr(haystack, needle));

	}

}

class Solution28 {
    public int strStr(String haystack, String needle) {
    	int index = haystack.indexOf(needle);
        return index;
    }
}


class Solution28_2 {
    public int strStr(String haystack, String needle) {
    	if(haystack.contains(needle)){
    		return haystack.indexOf(needle);
    	}
    	return -1;
    }
}


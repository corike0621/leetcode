package easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		String s = "luffy is still joyboy";
		Solution58 solution = new Solution58();
		System.out.println(solution.lengthOfLastWord(s));

	}

}

class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}
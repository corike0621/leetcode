package medium;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {

	public static void main(String[] args) {
		String s = "abpcplea";
		List<String> dictionary = new ArrayList<>();
		dictionary.add("abc");
		dictionary.add("abe");
//		dictionary.add("c");
		Solution524 solution = new Solution524();
		System.out.println(solution.findLongestWord(s, dictionary));
	}

}

class Solution524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String longestWord = "";
        
        for (String word : dictionary) {
        	if (isSubsequence(word, s)) {
        		if (word.length() > longestWord.length() || (word.length() == longestWord.length() && word.compareTo(longestWord) < 0)) {        			
        			longestWord = word;
        		}
        	}
        }
        
        return longestWord;
        
        // compareTo() 方法會按照字典順序進行比較，相等 = 0，	順序小 < 0，順序大 > 0。
        
    }
    
    // 先判斷每一單字是否為字串的子字串
    private boolean isSubsequence(String word, String s) {
    	int wordCount = 0, sCount = 0;
    	while (wordCount < word.length() && sCount < s.length()) {
    		if (word.charAt(wordCount) == s.charAt(sCount)) {
				wordCount++;
			}
    		sCount++;
    	}
    	
    	return wordCount == word.length();
    }
}
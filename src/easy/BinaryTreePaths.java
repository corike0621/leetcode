package easy;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class BinaryTreePaths {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
//		String pathString = "";
//		pathString = Integer.toString(root.val);
//		pathString += "->";
//		pathString += Integer.toString(root.left.val);
//		pathString += "->";
//		pathString += Integer.toString(root.right.val);
//		System.out.println(pathString);
		
		Solution257 solution = new Solution257();
		System.out.println(solution.binaryTreePaths(root));

	}

}

class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
        	constructPaths(root, "", paths);
        }
        
        return paths;
    }
    
    private void constructPaths(TreeNode root, String path, List<String> paths) {
    	path += Integer.toString(root.val);
    	if (root.left == null && root.right == null) { 
    		paths.add(path); // 每一條路徑結束就存入paths中
    	} else {
    		path += "->";
    		if (root.left != null) {
    			constructPaths(root.left, path, paths);
    		}
    		if (root.right != null) {
    			constructPaths(root.right, path, paths);
    		}
    	}
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

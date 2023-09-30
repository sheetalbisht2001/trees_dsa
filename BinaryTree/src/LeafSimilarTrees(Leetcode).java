// 872. Leaf-Similar Trees

// Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.



// For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

// Two binary trees are considered leaf-similar if their leaf value sequence is the same.

// Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

// Example 1:


// Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
// Output: true
// Example 2:


// Input: root1 = [1,2,3], root2 = [1,3,2]
// Output: false
 

// Constraints:

// The number of nodes in each tree will be in the range [1, 200].
// Both of the given trees will have values in the range [0, 200].





/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root1);

        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            if (temp.left == null && temp.right == null) {
                arr1.add(temp.val);
            }
            if (temp.right != null) {
                stack1.push(temp.right);
            }
            if (temp.left != null) {
                stack1.push(temp.left);
            }
        }

        stack2.push(root2);

        while (!stack2.isEmpty()) {
            TreeNode temp = stack2.pop();
            if (temp.left == null && temp.right == null) {
                arr2.add(temp.val);
            }
            if (temp.right != null) {
                stack2.push(temp.right);
            }
            if (temp.left != null) {
                stack2.push(temp.left);
            }
        }

        if (arr1.size() != arr2.size()) {
            return false;
        }

        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2.get(i))) {
                return false;
            }
        }

        return true;
    }
}


// 965. Univalued Binary Tree

// A binary tree is uni-valued if every node in the tree has the same value.

// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

 

// Example 1:


// Input: root = [1,1,1,1,1,null,1]
// Output: true
// Example 2:


// Input: root = [2,2,2,5,2]
// Output: false
 

// Constraints:

// The number of nodes in the tree is in the range [1, 100].
// 0 <= Node.val < 100



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
    public boolean isUnivalTree(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer> () ;

        Stack<TreeNode> stack = new Stack<>() ;
        stack.push(root) ;

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop() ;
            arr.add(temp.val);
            if(temp.right != null)
            {
                stack.push(temp.right) ;
            }
            if(temp.left != null)
            {
                stack.push(temp.left) ;
            }
        }

        int i=0;

      while(i<arr.size())  
      {
          if(arr.get(i)!=root.val)
          {
              return false ;
          }
          else 
          {
             i++ ;
          } 
      } 
                return true ;
    
    }   

}
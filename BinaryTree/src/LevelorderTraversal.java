// Level order traversal
// Given a binary tree, find its level order traversal.
// Level order traversal of a tree is breadth-first traversal for the tree.


// Example 1:

// Input:
//     1
//   /   \ 
//  3     2
// Output:1 3 2
// Example 2:

// Input:
//         10
//      /      \
//     20       30
//   /   \
//  40   60
// Output:10 20 30 40 60

// Your Task:
// You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.


// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)


// Constraints:
// 1 ≤ Number of nodes ≤ 105
// 1 ≤ Data of a node ≤ 105


/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/



class LevelorderTraversal 
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        
        
        //create an arraylist to store nodes values.

          ArrayList<Integer> ans = new ArrayList<>();

//create a queue and at numbers of each level only;
        Queue<Node> q = new LinkedList<>();

//when there is nothing in tree i.e empty;

if(node == null) return ans; // at this point ans is also empty;

 //add the parent root;
        q.add(node);
        
        while(!q.isEmpty()){

// store the value and remove from node
            Node curr = q.poll(); // after this q is empty .

// add the value of curr(removed node) to the array we created above
            ans.add(curr.data);

// add the left and right child into queue if they are not null;
            if(curr.left!=null){
                q.add(curr.left); // left added to q;
            }
            if(curr.right!=null){
                q.add(curr.right);// right added to q;
            }
        }

// at final return the ans;
        return ans;
        }
    }
    





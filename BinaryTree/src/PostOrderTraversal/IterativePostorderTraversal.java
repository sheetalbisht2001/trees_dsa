package PostOrderTraversal;

import java.util.Stack;

public class IterativePostorderTraversal {
          TreeNode root;

    static class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data; //generic type

        public TreeNode(int data) {
            this.data = data;

        }
    }


    //MAKING TREE
    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seven = new TreeNode(7);



        root = first; //root --> first
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        third.left = sixth;
        third.right = seven ;



    }

//POSTORDER
    public void Postorder() {
        TreeNode current = root ;

        Stack<TreeNode> stack = new Stack<>(); //create stack


        while (!stack.isEmpty() || current != null) {

            if (current != null) {
                stack.push(current);
                current = current.left ;
            }
            else {
                TreeNode temp = stack.peek().right ;
                if(temp == null)
                {
                    temp = stack.pop() ;
                    System.out.print(temp.data+ " ");
                    while(!stack.isEmpty() && temp == stack.peek().right)
                    {
                       temp =stack.pop() ;
                        System.out.print(temp.data + " ");
                    }
                }
                else {
                    current = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        IterativePostorderTraversal tree = new IterativePostorderTraversal() ;
        tree.createBinaryTree();

        tree.Postorder();


    }
}

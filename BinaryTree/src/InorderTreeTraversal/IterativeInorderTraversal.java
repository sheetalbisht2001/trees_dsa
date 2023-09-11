package InorderTreeTraversal;



import java.util.Stack;

public class IterativeInorderTraversal {

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
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);


        root = first; //root --> first
        first.left = second;
        first.right = third;

        second.left = forth;


    }

    //IN ORDER

    public void InOrder() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>(); //create stack
        TreeNode temp = root ;

        while (!stack.isEmpty() || temp != null) {

            if (temp != null) {
                stack.push(temp);
                temp = temp.left ;
            }
            else {
                temp = stack.pop() ;
                System.out.print(temp.data+ " ");
                temp = temp.right ;
            }
        }
    }

        public static void main(String[] args) {
        IterativeInorderTraversal tree = new IterativeInorderTraversal();
        tree.createBinaryTree();

        tree.InOrder();


    }
}

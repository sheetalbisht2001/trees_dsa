package PreorderTreeTraversal;

import java.util.Stack;

public class IterativePreorderTraversal {

    private TreeNode root ;
    private static class TreeNode{
        private TreeNode left ;
        private TreeNode right ;
        private int data ; //generic type

        public TreeNode(int data){
            this.data = data ;

        }
    }



    //MAKING TREE
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth= new TreeNode(4);


        root = first ; //root --> first
        first.left = second ;
        first.right = third ;

        second.left = forth ;


    }

    //ITERATIVE PREORDER TRAVERSAL //STACK(LIFO)
    public void preOrder(){
        if(root == null)
        {
            return ;
        }

        Stack<TreeNode> stack = new Stack<>() ;
        stack.push(root) ;

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop() ;
            System.out.print(temp.data + " ");
            if(temp.right != null)
            {
                stack.push(temp.right) ;
            }
            if(temp.left != null)
            {
                stack.push(temp.left) ;
            }
        }

    }

    public static void main(String[] args) {
        IterativePreorderTraversal tree = new IterativePreorderTraversal() ;
        tree.createBinaryTree();

        tree.preOrder();




    }

}

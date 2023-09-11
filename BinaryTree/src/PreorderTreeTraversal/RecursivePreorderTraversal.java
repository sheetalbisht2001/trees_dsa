package PreorderTreeTraversal;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class RecursivePreorderTraversal {


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

    //PRE ORDER

    public void preOrder(TreeNode root){
        if(root==null)
        {
            return ;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        RecursivePreorderTraversal tree = new RecursivePreorderTraversal() ;
        tree.createBinaryTree();

        tree.preOrder(tree.root);




    }


}


//OUTPUT : 9 2 4 3

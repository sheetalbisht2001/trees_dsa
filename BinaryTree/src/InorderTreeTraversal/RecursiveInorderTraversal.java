package InorderTreeTraversal;
import PreorderTreeTraversal.RecursivePreorderTraversal;

import java.util.* ;

//left,root,right

public class RecursiveInorderTraversal {

    RecursiveInorderTraversal.TreeNode root ;
    static class TreeNode{
        private RecursiveInorderTraversal.TreeNode left ;
        private RecursiveInorderTraversal.TreeNode right ;
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

    //INORDER

    public void InOrder(TreeNode root){
        if(root==null)
        {
            return ;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static void main(String[] args) {
        RecursiveInorderTraversal tree = new RecursiveInorderTraversal() ;
        tree.createBinaryTree();

        tree.InOrder(tree.root);




    }



}






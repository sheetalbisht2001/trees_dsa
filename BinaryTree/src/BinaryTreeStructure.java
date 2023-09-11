import javax.swing.tree.TreeNode;

public class BinaryTreeStructure {

    private TreeNode root ;
    private class TreeNode{
        private TreeNode left ;
        private  TreeNode right ;
        private int data ; //generic type

        public TreeNode(int data){
            this.data = data ;

        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth= new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first ; //root --> first
        first.left = second ;
        first.right = third ;

        second.left = forth ;
         second.right = fifth ;


    }

    public static void main(String[] args) {

    }
}

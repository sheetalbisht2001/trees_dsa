package PostOrderTraversal;


public class RecursivePostorderTraversal {
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

    //POSTORDER

    public void Postorder(TreeNode root) {
        if (root == null) {
            return;
        }


        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        RecursivePostorderTraversal tree = new RecursivePostorderTraversal();
        tree.createBinaryTree();

        tree.Postorder(tree.root);


    }
}

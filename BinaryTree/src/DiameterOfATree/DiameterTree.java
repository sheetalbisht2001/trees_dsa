package DiameterOfATree;
//TIME COMPLEXITY O(n2)


//Number of nodes in the longest path between any 2 nodes
//    CASE
//    1. diameter through root
//    2. diameter without root


//            1.left subtree
//            2.right subtree
//            3.left tree max height and right tree max height and add root


public class DiameterTree {


    static class Node { //NODE CLASS
        int data;
        Node left;
        Node right;

        Node(int data) { //CONSTRUCTOR
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }



    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) { //
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root) {
        if(root == null)
        {
            return 0 ;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right) ;

        int myHeight = Math.max(leftHeight,rightHeight)+ 1 ;
        return myHeight ;

    }

    public static int diameter(Node root){
        if(root==null)
        {
            return 0 ;
        }

        int diam1 = diameter(root.left) ;
        int diam2 = diameter(root.right) ;
        int diam3 = height(root.left)+height(root.right)+ 1;


        return  Math.max(diam3, Math.max(diam1, diam2)) ;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Preorder sequence

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter(root));


    }
}

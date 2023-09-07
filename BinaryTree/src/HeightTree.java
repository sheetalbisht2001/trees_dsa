public class HeightTree {

    //TIME COMPLEXITY O(n)


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

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Preorder sequence

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        System.out.println(height(root));
    }
}

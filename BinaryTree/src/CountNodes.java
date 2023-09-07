public class CountNodes {

//    TIME COMPLEXITY = O(n) ;

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

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Preorder sequence

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        int nodeCount = countNodes(root);
        System.out.println("Number of nodes in the binary tree: " + nodeCount);
    }
}

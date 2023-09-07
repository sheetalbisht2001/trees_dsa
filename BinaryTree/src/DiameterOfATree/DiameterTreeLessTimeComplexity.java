package DiameterOfATree;

public class DiameterTreeLessTimeComplexity {

    //TIME COMPLEXITY = O(n)


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
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;

    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam)//CONSTRUCTOR
        {
            this.ht = ht ;
            this.diam = diam ;
    }

}

      public static  TreeInfo diameter2(Node root){
            if(root==null)
            {
               return  new TreeInfo(0,0) ;
            }

            TreeInfo left = diameter2(root.left) ;
            TreeInfo right = diameter2(root.right) ;

            int myHeight = Math.max(left.ht,right.ht)+ 1 ;

            int diam1 = left.diam ;
            int diam2 = right.diam ;
            int diam3 = left.ht + right.ht + 1 ;

            int mydiam = Math.max(Math.max(diam1, diam2),diam3) ;

            TreeInfo myInfo = new TreeInfo(myHeight, mydiam) ;
            return myInfo ;
      }

        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Preorder sequence

            BinaryTrees tree = new BinaryTrees();
            Node root = tree.buildTree(nodes);

            System.out.println(diameter2(root).diam);


        }
    }



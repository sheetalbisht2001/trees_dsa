import javax.swing.plaf.basic.BasicSplitPaneUI;

public class BinaryTree {

//    TIME COMPLEXITY O(n)

//    //PREORDER TRAVERSAL
//     -> ROOT
//     ->LEFT
//      ->RIGHT


    // INORDER TRAVERSAL
    //->LEFT SUBTREE
    //->ROOT
    //->RIGHT SUBTREE

    //POSTORDER TRAVERSAL
    //LEFT SUBTREE
    //RIGHT SUBTREE
    //ROOT

    //LEVELORDER TRAVERSAL
    //1. QUEUE (FIFO PROPERTY)
    //2. NULL USE FOR NEXT LINE
    //3. BFS(BREADTH FIRST SEARCH) DFS (DEPTH FIRST SEARCH)


    static class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data){   //constructor
            this.data = data ;
            this.left = null ;
            this.right=null ;
        }
    }

    static class BinaryTrees{
        static int idx=-1 ;
        public static Node buildTree(int nodes[]){
            idx++ ;
            if(nodes[idx]==-1)
            {
                return null ;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes) ;
            newNode.right = buildTree(nodes) ;

            return newNode ;


        }
    }

    public static void preorder(Node root) //preorder traversal
    {
        if(root==null)
        {
            return ;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) //inorder traversal
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right) ;
    }

    public static void postorder(Node root) //postorder traversal
    {
        if(root==null)
        {
            return ;
        }

        postorder(root.left);
        postorder(root.right) ;
        System.out.println(root.data+" ");
    }

    public static void levelOrder(Node root) //level order traversal
    {

    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ; //preorder sequence

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes) ;

//        System.out.println(root.data);
//        preorder(root) ; //preorder call
//        inorder(root) ;   //inorder call

    }
}




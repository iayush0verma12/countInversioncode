public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
        public static Node insert(Node root, int val)
        {
            if(root==null)
            {
                root = new Node(val);
                return root;
            }
            if(root.data>val)
            {
                root.left=insert(root.left,val);
            }
           else
            {
                root.right=insert(root.right,val);
            }
           return root;
        }
        public static void inOrder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
        public static boolean Search(Node root,int key)
        {
            if(root==null)
            {
                return false;
            }
            if(key==root.data)
            {
                return true;
            }
            if(root.data>key)
            {
                return Search(root.left,key);
            }
            else
            {
                return Search(root.right,key);
            }
        }

        public static void main(String args[])
        {
            int values[]={1,2,4,3,5,7};//do experiment by searching it again and again
            Node root = null;
            for(int i = 0; i< values.length;i++)
            {
                root=insert(root,values[i]);
            }

//            inOrder(root);
//            System.out.println();
            System.out.println(Search(root,5));
        }
}

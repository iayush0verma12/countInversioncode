import java.sql.Struct;
import java.util.*;
import java.util.LinkedList;

public class preOrderTree {
    public static class Node{
        int data;
        Node left;
        Node Right;
        Node(int data)
        {
            this.data =data;
            this.left=null;
            this.Right=null;
        }
    }
    public static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.Right = buildTree(nodes);
            return newNode;
        }
        public static void preorder(Node root)
        {
            if(root==null)
            {
//                System.out.print(" -1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.Right);
        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
//                System.out.print(" -1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.Right);
        }
        public static void postorder(Node root)
        {
            if(root==null)
            {
                System.out.print(" -1 ");
                return;
            }
            postorder(root.left);
            postorder(root.Right);
            System.out.print(root.data+ " ");
        }
        public static void levelorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            Queue<Node>q=new LinkedList();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode=q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.Right!=null)
                    {
                        q.add(currNode.Right);
                    }
                }
            }

        }

        public static int heightOfTree(Node root)
        {
            if(root == null)
            {
                return 0;
            }
            int lh=heightOfTree(root.left);
            int rh=heightOfTree(root.Right);
            int height = Math.max(lh,rh)+1;
            return height;

        }
        public static int countOfTree(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lc = countOfTree(root.left);
            int rc = countOfTree(root.Right);
            return lc+rc+1;
        }
        public static int SumOfNode(Node root)
        {
            if(root==null)
            {
                return 0;
            }
//            int lc=0,rc=0;
//            lc=SumOfNode(root.left);
//            rc=SumOfNode(root.Right);
            return root.data+SumOfNode(root.left)+SumOfNode(root.Right);
        }
        public static int Diameter(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int ldia=Diameter(root.left);
            int lh=heightOfTree(root.left);
            int rdia=Diameter(root.Right);
            int rh=Diameter(root.Right);
            int SelfDia=lh+rh+1;
            return Math.max(SelfDia,Math.max(ldia,rdia));
        }
    }

    public static boolean isIdentical(Node root, Node subroot)
    {
        if(root==null && subroot ==null)
        {
            return true;
        }
        else if(root ==null || subroot ==null || subroot.data!=root.data)
        {
            return false;
        }
        if(!isIdentical(root.left,subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.left,subroot.left))
        {
            return false;
        }
        return true;
    }


    public static boolean isSubTree(Node root, Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))//This is for checking
            {
                return true;
            }
        }
        return isSubTree(root.left,subroot)||isSubTree(root.Right,subroot); //This is for traversal
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.Right);
        //final diameter
        int finalDia = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+ rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(finalDia,ht);
    }
    public static void KthLevel(Node root,int k,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==k)
        {
            System.out.print(root.data + " ");
            return;
        }
        KthLevel(root.left,k,level+1);
        KthLevel(root.Right,k,level+1);
    }

    public static void levelorderKthIndex(Node root,int k, int level)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode == null)
            {
                level++;
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else {
                if(k==level)
                {
                    System.out.print(currNode.data+" ");
                }
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.Right!=null)
                {
                    q.add(currNode.Right);
                }
            }
        }

    }

    public static void main(String args[])
    {
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        binaryTree tree= new binaryTree();
//        Node root =tree.buildTree(nodes);
//        System.out.println(root.data);
//        tree.preorder(root);
//        tree.inorder(root);
//        tree.postorder(root);
//        tree.levelorder(root);
//        System.out.println(tree.heightOfTree(root));
//        System.out.println(tree.countOfTree(root));
//        System.out.println(tree.SumOfNode(root));
//        System.out.println(tree.Diameter(root));

        //       1
        //      / \
        //     2   3
        //    / \  / \
        //   4   5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.Right = new Node(3);
        root.left.left= new Node(4);
        root.left.Right= new Node(5);
        root.Right.left = new Node(6);
        root.Right.Right= new Node(7);
        levelorderKthIndex(root,3,1);

//        KthLevel(root,3,1);  using preorder
//        System.out.println(diameter(root).diam);


        //             2
        //           /   \
        //          4     5
//        Node subroot = new Node(2);
//        subroot.left = new Node(4);
//        subroot.Right = new Node(5);
//        if(isSubTree(root,subroot))
//        {
//            System.out.println("They are identical!");
//        }
//        else
//        {
//            System.out.println("They are not identical!112");
//        }

    }
}

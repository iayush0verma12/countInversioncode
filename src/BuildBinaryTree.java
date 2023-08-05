import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void PreOrder(Node root) {
            if (root == null) {
                System.out.print(" null ");
                return;
            }
            System.out.print(root.data + " -> ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        public static void InOrder(Node root) {
            if (root == null) {
                System.out.print("  null ");
                return;
            }
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

        public static void Postorder(Node root) {
            if (root == null) {
                System.out.print(" null ");
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void LevelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node n = q.poll();
                if (n == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(n);
                    }
                } else {
                    System.out.print(" " + n.data + " ");
                    if (n.left != null) {
                        q.add(n.left);
                    }
                    if (n.right != null) {
                        q.add(n.right);
                    }
                }
            }
        }

        public static void heightOftree(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node n = q.poll();
                if (n == null) {
//                    count++;
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(n);
                    }
                } else {
                    if (n.left != null) {
                        q.add(n.left);
                    }
                    if (n.right != null) {
                        q.add(n.right);
                    }
                }
            }
        }

        public static int heightUsingRec(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = heightUsingRec(root.left);
            int rh = heightUsingRec(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        public static int countNode(Node root) {
            if (root == null) {
                return 0;
            }
            int lc = countNode(root.left);
            int rc = countNode(root.right);
            return lc + rc + 1;

        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = sumOfNodes(root.left);
            int rs = sumOfNodes(root.right);
            return ls + rs + root.data;
        }

        public static int diameterOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int d = 0;
            int ls = heightUsingRec(root.left);
            int rs = heightUsingRec(root.right);
            d = ls + rs;
            int leftD = diameterOfTree(root.left);
            int rightD = diameterOfTree(root.right);
            int max = Math.max(d, Math.max(leftD, rightD));
            return max;
        }
//        static class Info{
//            int diam;
//            int ht;
//            Info(int diam, int ht){
//                this.diam=diam;
//                this.ht=ht;
//            }
//        }
//        public static Info diameter(Node root){
//            if(root==null){
//                return new Info(0,0);
//            }
//
//            Info leftInfo = diameter(root.left);
//            Info rightInfo = diameter(root.right);
//
//            int diam = Math.max(Math.max(leftInfo.diam,rightInfo.ht),leftInfo.ht+rightInfo.ht+1);
//            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
//            return new Info(diam,ht);
//        }

        static class Info {
            int d;
            int h;

            Info(int d, int h) {
                this.d = d;
                this.h = h;
            }
        }

        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftD = diameter(root.left);
            Info rightD = diameter(root.right);
            int d = Math.max(Math.max(leftD.d, rightD.d), leftD.h + rightD.h + 1);
            int h = Math.max(leftD.h, +rightD.h) + 1;
            return new Info(d, h);
        }

        public static boolean check(Node root, Node subroot) {
            //bc
            if(root==null){
                return false;
            }
            if (root.data == subroot.data) {
                if (isidentical(root,subroot)) {
                    return true;
                }
            }
            boolean left = check(root.left,subroot);
            boolean right = check(root.right,subroot);
            return left || right;
        }
        public static boolean isidentical(Node root, Node subroot){
            if (root == null && subroot == null) {
                return true;
            } else if (root == null || subroot == null && root.data!=subroot.data) {
                return false;
            }
            if(!isidentical(root.left,subroot.left)){
                return false;
            }
            if(!isidentical(root.right,subroot.right)){
                return false;
            }
            return true;
        }

    }
//    public static int count=0;
    public static void main(String[] args) {

        // in the below code when you try to print subroot.data it will give error

/*        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes1 = {2,4,-1,-1,5,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        Node subroot = BinaryTree.buildTree(nodes1);
        System.out.println(subroot.data);*/


        // if the above will work then
        //        System.out.println(tree.check(root,root1));
        //should also work


        ///////////////////////////////////////
/*        tree.PreOrder(root);
        System.out.println();
        tree.InOrder(root);
        BinaryTree.Postorder(root);
        tree.LevelOrder(root);
        tree.heightOftree(root);
//        System.out.println(count);
        int h=tree.heightUsingRec(root);
        System.out.println(h);
        System.out.println(tree.countNode(root));
        System.out.println(tree.sumOfNodes(root));
        System.out.println(tree.diameterOfTree(root));
        System.out.println(tree.diameter(root).d);*/
        //////////////////////////////////////


        // here is the tree made by simply using nodes//

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//        Node subroot = new Node(2);
//        subroot.left = new Node(4);
//        subroot.right = new Node(5);

//        System.out.println(tree.check(root,subroot));
//        System.out.println(tree.check(root,root1));
    }
}

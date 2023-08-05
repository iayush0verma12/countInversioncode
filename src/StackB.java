import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackB {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }


//    public static class Stack{
//        static Node head=null;
//        public static boolean isEmpty()
//        {
//            return head==null;
//
//        }
//        public static void push(int data)
//        {
//            Node newNode = new Node(data);
//            if(isEmpty())
//            {
//                head=newNode;
//                return;
//            }
//            newNode.next=head;
//            head=newNode;
//        }
//        public static int pop()
//        {
//            int val=head.data;
//            head=head.next;
//            return val;
//        }
//        public static int peek()
//        {
//            return head.data;
//        }
//        static ArrayList<Integer> list=new ArrayList<>();
//        public static boolean isEmpty()
//        {
//            return list.size()==0;
//        }
//        public static void push(int data)
//        {
//            list.add(data);
//        }
//        public static int pop()
//        {
//            if(isEmpty())
//            {
//                return -1;
//            }
//            int val=list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return val;
//        }
//        public static int peek()
//        {
//            if(isEmpty())
//            {
//                return -1;
//            }
//            int val=list.get(list.size()-1);
//            return val;
//        }

//    }
    public static void main(String[] args) {
//        Stack s=new Stack();
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
//        System.out.println(s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}

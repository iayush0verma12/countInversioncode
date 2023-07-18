//import java.util.HashSet;
//
//public class LinkedList {
//
//    static class Node<Integer>{
//        int data;
//        Node next;
//        public Node(int data)
//        {
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public static int size;
//    public Node findMid(Node head)
//    {
//        Node slow=head;
//        Node fast=head;
//        while(fast!=null && fast.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//    public boolean checkPalindrome()
//    {
//
//        if(head==null||head.next==null)
//        {
//            return true;
//        }
//        Node mid = findMid(head);
//        Node curr=mid;
//        Node prev=null;
//        Node next;
//        while(curr!=null)
//        {
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        Node right=prev;
//        Node left=head;
//        while(right!=null)
//        {
//            if(left.data!=right.data)
//            {
//                return false;
//            }
//            left=left.next;
//            right=right.next;
//        }
//        return true;
//    }
//    public void addFirst(int data)
//    {
//        Node newNode= new Node(data);
//        size++;
//        if(head==null)
//        {
//            head=tail=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    public void addLast(int data)
//    {
//        Node newNode= new Node(data);
//        size++;
//        if(head==null)
//        {
//            head=tail=null;
//            return;
//        }
//        tail.next=newNode;
//        tail=newNode;
//    }
//
////    public int RemoveFirst()
////    {
////        if(size==0)
////        {
////            System.out.println("LL is empty");
////        }
////        else if(size==1)
////        {
////            int val=head.data;
////            head=tail=null;
////            return val;
////        }
////        int val=head.data;
////        head=head.next;
////        size--;
////        return val;
////    }
////    public void add(int idx,int data)
////    {
////        if(idx==0)
////        {
////            addFirst(data);
////            return;
////        }
////        Node newNode=new Node(data);
////        size++;
////        Node temp=head;
////        int i=0;
////        while(i<idx-1)
////        {
////            temp=temp.next;
////            i++;
////        }
//        //i=idx-1;
//    //9155693607
////        newNode.next=temp.next;
////        temp.next=newNode;
////
////    }
////    public int RemoveLast()
////    {
////        if(size==0)
////        {
////            System.out.println("Empty");
////            return Integer.MIN_VALUE;
////        }
////        else if(size==1)
////        {
////            int val=head.data;
////            head=tail=null;
////            size=0;
////            return val;
////        }
////        Node prev=head;
////        for(int i=0;i<size-2;i++)
////        {
////            prev=prev.next;
////        }
////        int val=prev.next.data;
////        prev.next=null;
////        tail=prev;
////        size--;
////        return val;
////    }
//    public void print()
//    {
//        if(head==null)
//        {
//            System.out.println("LL is empty");
//        }
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
////    public int itrSearch(int key)
////    {
////        Node temp= head;
////        int i=0;
////        while(temp!=null)
////        {
////            if(temp.data==key)
////            {
////                return i;
////            }
////            i++;
////        }
////        return -1;
////    }
////    public int recSearch(Node head,int key)
////    {
////        if(head==null)
////        {
////            return -1;
////        }
////        if(head.data==key)
////        {
////            return 0;
////        }
////        int idx=recSearch(head.next,key);
////        if(idx==-1)
////        {
////            return -1;
////        }
////        return idx+1;
////
////    }
////    public void reverse()
////    {
////        Node prev=null;
////        Node curr=tail=head;
////        Node next;
////        while(curr!=null)
////        {
////            next=curr.next;
////            curr.next=prev;
////            prev=curr;
////            curr=next;
////        }
////        head=prev;
////    }
////    public void deleteNthFromEnd(int n)
////    {
////        int sz=0;
////        Node temp=head;
////        while(temp!=null)
////        {
////            temp=temp.next;
////            sz++;
////        }
////        if(n==sz)
////        {
////            head=head.next;//remove first operation
////            return;
////        }
////        int idxToFind=sz-n;
////        int i=0;
////        Node prev=head;
////        while(i<idxToFind)
////        {
////            prev=prev.next;
////            i++;
////        }
////        prev.next=prev.next.next;
////        return;
////    }
////    boolean areIdentical(LinkedList l2)
////    {
////        Node a = head, b = l2.head;
////        while (a != null && b != null) {
////            if (a.data != b.data)
////                return false;
////
////            /* If we reach here, then a and b are not null
////               and their data is same, so move to next nodes
////               in both lists */
////            a = a.next;
////            b = b.next;
////        }
////
////        // If linked lists are identical, then 'a' and 'b'
////        // must be null at this point.
////        return (a == null && b == null);
////    }
//    public static boolean isCycle()
//    {
//        Node slow=head;
//        Node fast=head;
//        while(fast!=null&&fast.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//    public void RemoveCycle()
//    {
//        // Detect Cycle
//        // Find Last Node
//        Node slow=head;
//        Node fast=head;
//        boolean isCycle=false;
//        while(fast!=null&&fast.next!=null)
//        {
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast)
//            {
//                isCycle=true;
//                break;
//            }
//        }
//        if(isCycle == false)
//        {
//            return;
//        }
//        slow=head;
//        Node prev=null;
//        while(slow!=fast)
//        {
//            prev=fast;
//            slow=slow.next;
//            fast=fast.next;
//        }
//        prev.next=null;
//    }
//
//    public static void main(String args[]){
//      LinkedList ll = new LinkedList();
////        LinkedList l2= ll;
////        ll.addFirst(1);
////        ll.addFirst(2);
////        ll.addFirst(4);
////        ll.addFirst(3);
////        ll.addLast(5);
////        ll.addLast(6);
////        ll.add(2,8);
////        ll.print();
////        ll.RemoveFirst();
////        ll.print();
////        ll.RemoveLast();
////        ll.print();
////        System.out.println(ll.size);
////        System.out.println(ll.recSearch(head,4));
////        ll.reverse();
////        ll.print();
////        ll.deleteNthFromEnd(3);
////        ll.print();
////        if (ll.areIdentical(l2))
////            System.out.println("Identical ");
////        else
////            System.out.println("Not identical ");
////    }
//        /*ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(2);
//        ll.addFirst(1);*/
//       /* ll.print();
//        System.out.println(ll.checkPalindrome());*/
//        head= new Node(1);
//        Node temp=new Node(2);
//        head.next=temp;
//        head.next.next=new Node(3);
//        head.next.next.next=temp;
//        System.out.println(isCycle());
//        ll.RemoveCycle();
//        System.out.println(isCycle());
//        ll.print();
//        HashSet<Integer>hs = new HashSet<>();
//
//    }
//}
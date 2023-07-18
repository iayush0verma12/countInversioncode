//public class LinkedList1 {
//    public static class Node {
//            int data;
//            Node next;
//
//            public Node(int data) {
//                this.data = data;
//                this.next = next;
//            }
//    }
//        public static Node head;
//    public static Node tail;
//    public static int size;
//    public static void addFirst(int data)
//    {
//        size++;
//        //create a new node
//        //new node next == head
//        // head = new node;
//        Node newNode = new Node(data);
//
//        if(head==null)
//        {
//            head=tail=newNode;
//            return;
//        }
//        newNode.next = head;
//        head=newNode;
//
//
//    }
//    public static void addLast(int data)
//    {
//        size++;
//        Node newNode = new Node(data);
//        if(head==null)
//        {
//            head=tail=newNode;
//            return;
//        }
//        tail.next=newNode;
//        tail=newNode;
//    }
//    public static void print()
//    {
//        Node temp = head;
//        if(head==null)
//        {
//            System.out.println("LL is empty!");
//        }
//        while(temp!=null)
//        {
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.print("null");
//    }
//    public static void addMiddle(int idx,int data)
//    {
//        size++;
//        if(idx==0)
//        {
//            addFirst(data);
//        }
//        if(head==null)
//        {
//            head=tail=null;
//        }
//        Node newNode = new Node(data);
//        Node temp = head;
//        int i=0;
//        while(i<idx-1)
//        {
//            temp=temp.next;
//            i++;
//        }
//        i=idx-1;
//        newNode.next=temp.next;
//        temp.next=newNode;
//
//    }
//    public static int RemoveFirst()
//    {
//        if(size==0)
//        {
//            System.out.println("LL is empty");
//        }
//        else if (size==1)
//        {
//            int val=head.data;
//            head=tail=null;
//            return val;
//        }
//        int val=head.data;
//        head=head.next;
//        size--;
//        return val;
//    }
//    public static int RemoveLast()
//    {
//        if(size==0)
//        {
//            System.out.println("LL is empty");
//            return Integer.MIN_VALUE;
//        }
//        else if (size ==1)
//        {
//            int val = head.data;
//            head=tail=null;
//            return val;
//        }
//
//        Node temp1=head;
//        for(int i =0; i<size-2;i++)
//        {
//            temp1=temp1.next;
//        }
//        int val= temp1.next.data;
//        temp1.next=null;
//        tail=temp1;
//        size--;
//        return val;
//    }
//    public static int iterativeSearch(int key)
//    {
//        if(size==0)
//        {
//            return -1;
//        }
//        else if (size==1) {
//            head=tail;
//            if(head.data==key)
//            {
//                return 0;
//            }
//            else
//            {
//                return -1;
//            }
//        }
//        Node temp=head;
//        int i=0;
//        while(i<size)
//        {
//            if(temp.data==key)
//            {
//                return i;
//            }
//            temp=temp.next;
//            i++;
//        }
//        return -1;
//    }
//    public static int helper(Node head, int key)
//    {
//        if(head==null)
//        {
//            return -1;
//        }
//        if(head.data==key)
//        {
//            return 0;
//        }
//        int idx= helper(head.next,key);
//        if(idx==-1)
//        {
//            return -1;
//        }
//        return idx+1;
//    }
//    public static int recSearch(int key)
//    {
//        return helper(head,key);
//    }
//    public  static void reverse()
//    {
//        Node prev=null;
//        Node curr=tail=head;
//        Node next;
//        while(curr!=null)
//        {
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        head=prev;
//    }
//    public static void NthNumberFromEnd(int n)
//    {
//        int sz=0;
//        Node temp=head;
//        while(temp!=null)
//        {
//            temp=temp.next;
//            sz++;
//        }
//        if(n==sz)
//        {
//            head=head.next;
//        }
//        int idxToFind=sz-n;
//        Node prev=head;
//        int i=1;
//        while(i<idxToFind)
//        {
//            prev=prev.next;
//            i++;
//        }
//        prev.next=prev.next.next;
//    }
//        public static void main(String args[]) {
//        LinkedList1 ll = new LinkedList1();
//        System.out.println();
//        print();
//        ll.addFirst(1);
//        System.out.println();
//        print();
//        ll.addFirst(2);
//        System.out.println();
//        print();
//        ll.addFirst(3);
//        System.out.println();
//        print();
//        ll.addLast(3);
//        System.out.println();
//        print();
//        ll.addLast(5);
//        System.out.println();
//        print();
//        addMiddle(2,112);
//        System.out.println();
//        print();
//
//        RemoveFirst();
//        System.out.println();
//        print();
//
//        RemoveLast();
//        System.out.println();
//        print();
//        System.out.println("\n"+ll.size);
//
//        System.out.println(iterativeSearch(112));
//        System.out.println(recSearch(1));
//        System.out.println();
//        reverse();
//        print();
//        NthNumberFromEnd(2);
//        System.out.println();
//        print();
//        }
//}
//

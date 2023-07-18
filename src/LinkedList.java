import java.util.HashSet;

public class LinkedList {

    public static class Node{
        int data;
        Node next;
        public Node (int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static int size=0;

    //addFirst
    public static void addAtFirst(int n)
    {
        size++;
        Node newNode=new Node(n);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void addLast(int n)
    {
        size++;
        Node newNode=new Node(n);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }
    public static void print()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Null");
            return;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addMiddle(int n,int idx)
    {
        size++;
        if(idx==0)
        {
            addAtFirst(n);
            return;
        }
        Node newNode=new Node(n);
        Node temp=head;
        for(int i=0;i<idx-1;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }
    public static void removeFirst()
    {
        size--;
        if(head==null)
        {
            head=tail=null;
            System.out.println("Nothing to Remove!");
            return;
        }
        head=head.next;
    }

    public static void removeLast()
    {
        size--;
        if(head==null)
        {
            head=tail=null;
            System.out.println("Nothing to Remove!");
            return;
        }
        Node temp=head;
        for(int i=0;i<size-1;i++)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void removeAt(int idx)
    {
        size--;
        if(head==null)
        {
            head=tail=null;
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    public static void iterative(int k)
    {
        Node temp=head;
        int cnt=0;
        while(temp!=null)
        {
            if(temp.data==k)
            {
                System.out.println("Key found at : "+cnt );
            }
            cnt++;
            temp=temp.next;
        }
    }
    public static int recursion(Node temp, int key , int i)
    {
        if(temp==null)
        {
            System.out.println("Key Not Found!");
            return -1;
        }
        if(temp.data==key)
        {
            return i;
        }
        return recursion(temp.next,key,i+1);
    }
    public static int recScnd(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx=recScnd(head.next,key);
        if(idx==-1)
        {
            return -1;
        }
        return idx+1;

    }
    public static void reverse_iterative()
    {
        Node curr=tail=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static Node getMid(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node mergeSortLL(Node head)
    {
        if(head==null ||head.next==null)
        {
            return head;
        }
        //get mid
        Node mid=getMid(head);
        Node rh=mid.next;
        mid.next=null;

        Node newleft=mergeSortLL(head);
        Node newright=mergeSortLL(rh);
       return mergeLL(newleft,newright);
    }
    public static Node mergeLL(Node lh, Node rh)
    {

//        mid.next=null;
        //
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(lh!=null && rh!=null)
        {
            if(lh.data>rh.data)
            {
                temp.next=rh;
                rh=rh.next;
                temp=temp.next;
            }
            else
            {
                temp.next=lh;
                lh=lh.next;
                temp=temp.next;
            }
        }
        while(lh!=null)
        {
            temp.next=lh;
            lh=lh.next;
            temp=temp.next;
        }
        while(rh!=null)
        {
            temp.next=rh;
            rh=rh.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }

    public static void zigzagLL()
    {
        //find middle
        Node mid=getMid(head);


        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node lh=head;
        Node rh=prev;
//        mid.next=null;

        Node nextLeft;
        Node nextRight;
        while(lh!=null && rh!=null) {
            nextLeft = lh.next;
            lh.next = rh;
            nextRight = rh.next;
            rh.next = nextLeft;

            lh=nextLeft;
            rh=nextRight;
        }
    }


    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        print();
//        ll.head=mergeSortLL(ll.head);
        zigzagLL();
        ll.print();
//        Node one=head;
//        Node two=head;
//        one.data=one.data+two.data;
//        ll.print();
//        ll.print();
//        ll.addAtFirst(5);
//        ll.addLast(6);
//        ll.addLast(7);
//        ll.addLast(8);
//        ll.addLast(9);
//        ll.addLast(10);
//        ll.print();
//        System.out.println(ll.size);
//        ll.addMiddle(50987,2);
//        ll.print();
//        ll.removeFirst();
//        ll.print();
//        System.out.println(size);
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
//        ll.removeAt(4);
//        ll.print();
//        System.out.println(ll.size);
//        ll.iterative(7);
//        Node temp=head;
//        int key=7;
//        System.out.println("Key found at : "+ll.recursion(temp,key,0));
//        System.out.println("Ket found at :"+ll.recScnd(head,key));
//        ll.reverse_iterative();
//        ll.print();

    }
}

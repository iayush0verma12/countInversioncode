public class DoubleLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addFirst(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public static int removeFirst()
    {
        if(head==null)
        {
            size--;
            return -1;
        }
        if(size==1)
        {
            size--;
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public static void print()
    {
        if(head==null)
        {
            System.out.println("null");
            return;
        }

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" <=> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void addLast(int data)
    {
        size++;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public static int removeLast()
    {
        if(size<2)
        {
            size--;
            return -1;
        }
        Node temp=head;
       //bc
       for(int i=0;i<size-2;i++)
       {
           temp=temp.next;
       }
       int val=tail.data;
       tail.prev=null;
       temp.next=null;
       size--;
       return val;
    }
    public static void ReverseAdll()
    {
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        addFirst(2);
        addFirst(4);
        addFirst(5);
        addFirst(6);
        addFirst(7);
        addFirst(78);
        print();
        System.out.println("First removed element is - "+removeFirst());
        print();
        addLast(3);
        addLast(4);
        addLast(7);
        print();
        System.out.println("By removing The Last Element we get : "+removeLast());
        print();
        ReverseAdll();
        print();
    }
}

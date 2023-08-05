public class QueueUsingLL {
    static class queue{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail ==null;
        }
        public static void add(int data){
            Node newnode= new Node(data);
            if(isEmpty()){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int head_data=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return head_data;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        queue q = new queue();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }




}

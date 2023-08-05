public class CircularArrayQueue {
    static class queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;
        queue(int n){
            arr = new int[n];
            rear=-1;
            front=-1;
            size=n;

        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return (rear+1)%size==front;

        }

        public static void add(int n){
            if(isfull()){
                System.out.println("It is Full");
                return;
            }
            if(front ==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
        }
        public static int remove(){
            if(isEmpty()) {
                System.out.println("it is Empty");
                return -1;
            }
            int f=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
            front=(front+1)%size;}
            return f;
        }
        public static int peek(){
            if(isEmpty()){

                System.out.println("Queue is EMPTY");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q= new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

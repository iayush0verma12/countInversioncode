public class queueUsingARRAY {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int n){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear]=n;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
//        Queue q = new Queue<>();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);


        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }


    }
}

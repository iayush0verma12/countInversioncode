import java.util.PriorityQueue;

public class KthLargestOddNumber {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int L=-3,R=1098765,K=1;
        for(int i=L;i<=R;i++){
            if(i%2!=0){
            pq.add(i);
            }
            if(pq.size()>K){
                pq.poll();
            }
        }

        System.out.println(pq.poll());
    }
}

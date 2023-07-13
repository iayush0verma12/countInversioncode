import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {
    static class Student implements Comparable<Student>//overriding
    {
        String name;
        int rank;
        public Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2)
        {
            return this.rank- s2.rank;
        }
    }
    public static void main(String args[])
    {
        //1,2,3,4,5
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("B",65));
        pq.add(new Student("C",78));
        pq.add(new Student("D",99));
        pq.add(new Student("E",7));
        pq.add(new Student("F",3));
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}

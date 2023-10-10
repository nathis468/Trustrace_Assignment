import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String args[]){
        PriorityQueue<String> pq=new PriorityQueue();
        pq.add("Gfg");
        pq.add("Faf");
        pq.add("Armature");
        System.out.println(pq.peek());
        pq.add("Don");
        pq.add("Oracle");
        pq.remove("Don");
        System.out.println(pq);
        Iterator iterator=pq.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
}

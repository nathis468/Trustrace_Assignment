import java.util.ArrayDeque;

public class Arraydeque1{
    public static void main(String args[]){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(43);
        ad.addLast(82);
        ad.addFirst(43);
        ad.offer(73);
        ad.add(75);
        ad.add(94);
        ad.poll();
        ad.remove(43);
        System.out.println(ad);
    }
}
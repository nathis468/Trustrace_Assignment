import java.util.LinkedList;

class LinkedList1{
    public static void main(String args[]){
        LinkedList<String> ll1=new LinkedList();
        LinkedList<String> ll2=new LinkedList();
        ll1.add("Devid");
        ll1.add("Rahul");
        ll1.addFirst("Virat");
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();
        ll1.remove(1);
        ll1.add(1,"Jawan");
        ll1.addLast("Nord");
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();
        ll1.set(1,"truke");
        ll1.remove("Rahul");
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();
        ll2.add("Pathaan");
        ll2.add("Cloud");
        ll2.removeLast();
        ll2.add("Hacker");
        System.out.println(ll2.size());
        for(String val:ll2){
            System.out.print(val+" ");
        }
        System.out.println();
        ll1.addAll(ll2);
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();
        ll1.removeAll(ll2);
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();
        ll1.removeFirst();
        for(String val:ll1){
            System.out.print(val+" ");
        }
        System.out.println();

    }
}
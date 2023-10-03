import java.util.TreeSet;

class TreeSet1 {
    public static void main(String args[]){
        TreeSet<String> ts=new TreeSet<>();
        TreeSet<String> ts2=new TreeSet<>();
        ts.add("Cham");
        ts.add(("Varun"));
        System.out.println(ts.contains("Cham"));
        ts.add(("9"));
        ts.add(("5"));
        System.out.println(ts.size());
        ts.add(("Aarif"));
        ts.add(("Malik")); 
        ts.add(("10010"));
        ts2.add("Varun");
        ts2.add("Hayyoda");
        ts.add("Nothing");
        System.out.println(ts.isEmpty());
        for(String val:ts){
            System.out.print(val+" ");
        }
        System.out.println();
        ts.addAll(ts2);
        for(String val:ts){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
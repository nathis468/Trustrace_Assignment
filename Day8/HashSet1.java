import java.util.HashSet;

class HashSet1 {
    public static void main(String args[]){
        HashSet<String> hs1=new HashSet();
        HashSet<String> hs2=new HashSet();
        hs1.add("Hayyoda");
        hs1.add("Himal");
        hs1.add("Indrop");
        hs1.add("Hayyoda");
        for(String value:hs1){
            System.out.print(value+" ");
        }
        System.out.println();
        hs2.add("Herbal");
        hs2.add("Vimal");
        hs2.add("Arun");
        hs1.addAll(hs2);
        for(String value:hs1){
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

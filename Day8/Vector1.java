import java.util.Vector;

public class Vector1 {
    public static void main(String args[])    {
        Vector<Integer> vt=new Vector<>();
        vt.add(54);
        vt.add(23);
        vt.add(87);
        vt.add(67);
        vt.remove(2);
        vt.set(1,45);
        vt.add(94);
        for(Integer value:vt){
            System.out.print(value+" ");
        }
    }
}

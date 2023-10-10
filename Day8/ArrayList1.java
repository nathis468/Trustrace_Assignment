import java.util.ArrayList;

class ArrayList1{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList();
        al.add("Geeks");
        al.add("Mohan");
        al.add(1,"Raj");
        al.add("Suguar");
        al.add(2,"Ashwin");
        al.add("Bala");
        for(String value:al){
            System.out.print(value+" ");
        }
        System.out.println();
        al.remove(1);
        al.remove("Geeks");
        for(String value:al){
            System.out.print(value+" ");
        }
        System.out.println();
        al.set(2,"Hrithik");
        for(String value:al){
            System.out.print(value+" ");
        }
        System.out.println();
        System.out.println(al.get(3));
    }
}
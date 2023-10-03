import java.util.Map;
import java.util.Hashtable;

public class HashTable1 {
    public static void  main(String args[]){
        Hashtable<String,Integer> hm=new Hashtable<>();
        hm.put("Hashing",2);
        hm.put("GFG",3);
        hm.put("GFG",4);
        hm.put("Codechef",7);
        hm.put("leet",7);
        hm.put(null,null);
        hm.remove("Hashing");
        hm.put("Earth",8);
        for(Map.Entry<String,Integer> value:hm.entrySet()){
            System.out.println(value.getKey()+":"+value.getValue());
        }
    }
}

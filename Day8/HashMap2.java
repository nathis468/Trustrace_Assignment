import java.util.Map;
import java.util.HashMap;

public class HashMap2 {
    public static void  main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
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

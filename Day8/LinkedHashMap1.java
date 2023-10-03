import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String args[])    {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Hashing",2);
        lhm.put("GFG",3);
        lhm.put("GFG",4);
        lhm.put("Codechef",7);
        lhm.put("leet",7);
        lhm.put(null,null);
        lhm.remove("Hashing");
        lhm.put("Earth",8);
        for(Map.Entry<String,Integer> value:lhm.entrySet()){
            System.out.println(value.getKey()+":"+value.getValue());
        }    }
}

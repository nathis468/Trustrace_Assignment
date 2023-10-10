import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String args[]){
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Dhoni",7);
        tm.put("Virat",4);
        tm.put("Virat",2);
        tm.put("Sachin",8);
        tm.put("Ashwin",9);
        tm.remove("Sachin");
        for(Map.Entry<String,Integer> value:tm.entrySet()){
            System.out.println(value.getKey()+":    "+value.getValue());
        }
    }
}

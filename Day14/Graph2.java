import java.util.*;

class GraphNode{
    Integer data;
    GraphNode(Integer data){
        this.data=data;
    }
}

class Implementation{
    Scanner sc=new Scanner(System.in);
    static HashMap<Integer,ArrayList<GraphNode>> map=new HashMap<>();
    void insert(int v,int e){
        GraphNode curr=new GraphNode(e);
        if(map.containsKey(v)){
            map.get(v).add(curr);
            if(!map.containsKey(e)){
                insert(e,v);
            }
        }
        else{
            map.put(v,new ArrayList());
            map.get(v).add(curr);
            if(!map.containsKey(e)){
                insert(e,v);
            }
        }
    }
    void dfs_traversal(Integer curr,HashSet<Integer> hs){
        if(!hs.contains(curr)){
            if(map.containsKey(curr)){
                hs.add(curr);
                System.out.println(curr);
                for(int i=0;i<map.get(curr).size();i++){
                    dfs_traversal(map.get(curr).get(i).data,hs);
                }
            }
        }
    }
}

class Graph2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();

        int n=sc.nextInt();
        while(n>0){
            Integer v=sc.nextInt();
            Integer e=sc.nextInt();
            im.insert(v, e);
            n--;
        }
        // for(Map.Entry<Integer,ArrayList<GraphNode>> entry:im.map.entrySet()){
        //     System.out.print(entry.getKey()+" ");
        //     for(GraphNode i:entry.getValue()){
        //         System.out.print(i.data+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Enter the node which you want to make a start node");
        Integer root=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        im.dfs_traversal(root,hs);
    }
}
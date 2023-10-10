import java.util.*;

class TreeNode{
    int data;
    List<TreeNode> al; 
    TreeNode(int data){
        this.data=data;
        al=new ArrayList<>();
    }
}

class Implementation{
    TreeNode root;
    Scanner sc=new Scanner(System.in);

    TreeNode insert(){
        System.out.println("Enter the root node : ");
        TreeNode temp=new TreeNode(sc.nextInt());
        root=temp;
        insert_dfs(root);
        return root;
    }

    void insert_dfs(TreeNode curr){     
        System.out.println("Do you want to insert child node for : "+curr.data);
        Boolean choice=sc.nextBoolean();
        if(choice){
            System.out.println("Please enter the node to insert : ");
            TreeNode temp=new TreeNode(sc.nextInt());
            curr.al.add(temp);
            insert_dfs(curr);
        }
        else{
            for(int i=0;i<curr.al.size();i++){
                insert_dfs(curr.al.get(i));
            }
        }
    }

    void traversal_bfs(TreeNode curr){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(curr);
        System.out.print(curr.data+" ");
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            int flag=0;
            for(int i=0;i<temp.al.size();i++){
                flag=1;
                System.out.print(temp.al.get(i).data+" ");
                q.add(temp.al.get(i));
            }
        }
    }
    
    int find_height(TreeNode curr){
        if (curr == null) {
            return 0;
        }
        int maxHeight = 0;
        for (TreeNode val : curr.al) {
            int childHeight = find_height(val);
            maxHeight = Math.max(maxHeight, childHeight);
        }
        return maxHeight + 1;
    }

    void traversal_dfs_preorder(TreeNode curr){
        System.out.print(curr.data+" ");
        if(curr.al.size()!=0){
            for(TreeNode val:curr.al){
                traversal_dfs_preorder(val);
            }
        }
    }
}
    
class NAryTree1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode root=null;
        Implementation im=new Implementation();
        root=im.insert();

        System.out.println("\nPrinting the tree in BFS order : ");
        im.traversal_bfs(root);

        System.out.println("\nPrinting the tree in DFS order : ");
        im.traversal_dfs_preorder(root);

        System.out.println("Height of the N-Ary tree is : "+im.find_height(root));
    }
}

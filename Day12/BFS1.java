import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class Implementation{
    ArrayList<Integer> traversal(TreeNode root,ArrayList<Integer> al){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            al.add(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return al;
    }
}

class BFS1{
    
    public static void main(String[] args){

        TreeNode root=null;
        TreeNode first=new TreeNode(1);
        root=first;

        TreeNode second=new TreeNode(2);
        root.left=second;

        TreeNode third=new TreeNode(3);
        root.right=third;

        TreeNode fourth=new TreeNode(4);
        second.left=fourth;

        TreeNode fifth=new TreeNode(5);
        second.right=fifth;

        TreeNode sixth=new TreeNode(6);
        third.left=sixth;

        TreeNode seventh=new TreeNode(7);
        third.right=seventh;

        ArrayList<Integer> al=new ArrayList<>();


        Implementation im=new Implementation();
        System.out.println(im.traversal(root,al));
    }
}

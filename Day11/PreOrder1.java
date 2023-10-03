import java.util.List;
import java.util.ArrayList;

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
    List<Integer> traversal(TreeNode curr,List<Integer> al){
        if(curr==null){
            return al;
        }
        al.add(curr.data);
        traversal(curr.left,al);
        traversal(curr.right, al);
        return al;
    }
}

class PreOrder1{
    
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

        List<Integer> al=new ArrayList<>();

        Implementation im=new Implementation();
        System.out.println(im.traversal(root, al));
    }
}

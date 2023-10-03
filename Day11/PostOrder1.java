import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    TreeNode root;
    void insert(int num){
        TreeNode temp=new TreeNode(num);
        if(root==null){
            root=temp;
            return;
        }
        TreeNode curr=root;
        while(curr.left!=null){
            
        }
    }

    List<Integer> return_as_list(TreeNode currNode,List<Integer> al){
        if(currNode==null){
            return al;
        }
        return_as_list(currNode.left, al);
        return_as_list(currNode.right, al);
        al.add(currNode.data);
        return al;
    }

}

class PostOrder1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        TreeNode root=null;
        Implementation im=new Implementation();

        // TreeNode first=new TreeNode(4);
        // root=first;

        // TreeNode second=new TreeNode(7);
        // root.left=second;

        // TreeNode third=new TreeNode(8);
        // root.right=third;

        // TreeNode fourth=new TreeNode(10);
        // second.left=fourth;

        // TreeNode fifth=new TreeNode(12);
        // second.right=fifth;

        // TreeNode sixth=new TreeNode(14);
        // third.left=sixth;

        // TreeNode seventh=new TreeNode(16);
        // third.right=seventh;

        int n=sc.nextInt();
        while(n>0){
            im.insert(sc.nextInt());
            n--;
        }


        List<Integer> al=new ArrayList<>();
        System.out.println(im.return_as_list(root,al));
    }
}
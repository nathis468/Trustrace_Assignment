import java.util.*;

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
    Scanner sc=new Scanner(System.in);
    TreeNode root=null;

    TreeNode insert(TreeNode root,int num){
        TreeNode temp=new TreeNode(num);
        if(root==null){
            root = temp;
            return root;
        }
        else if(root.data>temp.data){
            
            root.left=insert(root.left,num);
        }
        else if(root.data<temp.data){
            
            root.right=insert(root.right,num);
        }
        return root;
    }

    void pre_order_traversal(TreeNode curr){
        if(curr==null){
            return;
        }
        System.out.print(curr.data+" ");
        pre_order_traversal(curr.left);
        pre_order_traversal(curr.right);
    }

    void in_order_traversal(TreeNode curr){
        if(curr==null){
            return;
        }
        in_order_traversal(curr.left);
        System.out.print(curr.data+" ");
        in_order_traversal(curr.right);
    }

    void post_order_traversal(TreeNode curr){
        if(curr==null){
            return;
        }
        post_order_traversal(curr.left);
        post_order_traversal(curr.right);
        System.out.print(curr.data+" ");
    }

    void level_order_traversal(TreeNode curr){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(curr);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    
    TreeNode binary_search(TreeNode root,int target){
        if(root==null){
            return root;
        }
        else if(root.data>target){
            root=binary_search(root.left,target);
        }
        else if(root.data<target){
            root=binary_search(root.right,target);
        }
        return root;
    }
}

public class BinarySearchTree1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode root=null;
        Implementation im=new Implementation();


        
        while(true){
            System.out.println("\nEnter your choice \n1.Add an element \n2.Preorder traversal \n3.Inorder traversal \n4.PostOrder traversal \n5.LevelOrder traversal \n6.Search an element \n7.Exit");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the element : ");
                    root=im.insert(root,sc.nextInt());
                    break;
                
                case 2:
                    im.pre_order_traversal(root);
                    break;
                
                case 3:
                    im.in_order_traversal(root);
                    break;
                
                case 4:
                    im.post_order_traversal(root);
                    break;
                
                case 5:
                    im.level_order_traversal(root);
                    break;
                
                case 6:
                    System.out.println("Enter the element to search");
                    int target=sc.nextInt();
                    root=im.binary_search(root,target);
                    if(root!=null){
                        System.out.println("The given element is found in the tree");
                    }
                    else{
                        System.out.println("The given element is not found in the tree");
                    }
                    break;

                case 7:
                    System.exit(0);

            }
        }
    }
}

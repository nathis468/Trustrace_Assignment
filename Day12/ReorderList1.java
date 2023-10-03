import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Implementation{
    Node head;
    void reorderlist(){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2;
        if(fast.next==null){
            head2=slow;
        }
        else{
            head2=slow.next;
        }
        
        Node prev=null;
        Node curr=head2;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head2=prev;
        
        Node curr1=head;
        Node curr2=head2;
        Node temp1=head;
        Node temp2=head2;
        
        while(curr2.next!=null){
            if(temp1==prev){
                break;
            }
            temp1=curr1.next;
            curr1.next=curr2;
            temp2=curr2.next;
            curr2.next=temp1;
            curr1=temp1;
            curr2=temp2;
        }
    }

    void insert_end(int num){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}        

class ReorderList1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Node head=null;
        System.out.println("Enter the total length : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements : ");
        Implementation im=new Implementation();
        while(n>0){
            im.insert_end(sc.nextInt());
            n--;
        }
        System.out.println("Before reordering  the list : ");
        im.print();
        im.reorderlist();
        System.out.println("After reordering  the list : ");
        im.print();
    }
}
        
        
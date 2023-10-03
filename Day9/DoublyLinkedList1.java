import java.util.Scanner;

class Node{
    Node prev;
    int data;
    Node next;
    Node(int x){
        prev=null;
        data=x;
        next=null;
    }
}

class Implementation{
    Node insert_end(Node head,int num){
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
            temp.prev=curr;
        }
        return head;
    }
    Node insert_at_any_pos(Node head,int num,int pos){
        Node temp=new Node(num);
        if(pos==1){
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
        else{
            int count=1;
            Node curr=head;
            while(curr!=null){
                if(count==pos){
                    temp.prev=curr.prev;
                    curr.prev.next=temp;
                    temp.next=curr;
                    curr.prev=temp;
                }
                curr=curr.next;
                count++;
            }
        }
        return head;
    }
    Node remove_element(Node head,int num){
        if(head.data==num && head.next==null){
            head=null;
        }
        else if(head.data==num){
            head=head.next;
            head.prev=null;
        }
        else{
            Node curr=head;
            while(curr!=null){
                if(curr.data==num){
                    if(curr.next==null){
                        curr.prev.next=null;
                    }
                    else{
                        curr.prev.next=curr.next;
                        curr.next.prev=curr.prev;
                    }
                }
                curr=curr.next;
            }
        }
        return head;
    }
    Node replace(Node head,int num1,int num2){
        Node temp=new Node(num2);
        if(head.data==num1 && head.next==null){
            head=temp;
        }
        else if(head.data==num1){
            temp.next=head.next;
            head.next.prev=temp;
            head=temp;
        }
        else{
            Node curr=head;
            while(curr!=null){
                if(curr.data==num1){
                    curr.prev.next=temp;
                    curr.next.prev=temp;
                    temp.prev=curr.prev;
                    temp.next=curr.next;
                }
                curr=curr.next;
            }
        }
        return head;
    }
    Node reverse(Node head){
        Node curr=head;
        Node temp=null;
        while(curr!=null){
            temp=curr.prev;   
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        head=temp.prev;
        return head;
    }
    void search_element(Node head,int num){
        int count=1;
        if(head.data==num){
            System.out.println("The gievn element present at position : "+count);
            return;
        }
        Node curr=head;
        while(curr!=null){
            if(curr.data==num){
                System.out.println("The gievn element present at position : "+count);
                return;
            }
            curr=curr.next;
            count++;
        }
        System.out.println("The given element is not present inside the list");
    }

    void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

class DoublyLinkedList1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        Node head=null;

        int flag=0;
        while(flag==0){
            System.out.println("\nEnter your choice : \n1.Add element at the end \n2.Add element at any position \n3.Remove element at any position \n4.Replace an element \n5.Reverse a list \n6.Search an element \n7.Print the list \n8.Exit \n");
            int input=sc.nextInt();
            switch(input){
                case 1:
                    System.out.println("Enter the element : ");
                    int num=sc.nextInt();
                    head=im.insert_end(head,num);
                    break;
                
                case 2:
                    System.out.println("Enter the element to be inserted : ");
                    int num1=sc.nextInt();
                    System.out.println("Enter the position of the element to be inserted : ");
                    int pos=sc.nextInt();
                    head=im.insert_at_any_pos(head, num1, pos);
                    break;
                
                case 3:
                    System.out.println("Enter the element to be deleted : ");
                    int num2=sc.nextInt();
                    head=im.remove_element(head,num2);
                    break;          


                case 4:
                    System.out.println("Enter the element want to replace : ");
                    int num3=sc.nextInt();
                    System.out.println("Enter the element to be replaced of : ");
                    int num4=sc.nextInt();
                    head=im.replace(head, num3, num4);
                    break;

                case 5:
                    head=im.reverse(head);
                    break;

                case 6:
                    System.out.println("Enter the element want to search : ");
                    int num5=sc.nextInt();
                    im.search_element(head, num5);
                    break;

                case 7:
                    im.print(head);
                    break;

                case 8:
                    flag=1;
            }
        }
    }
}
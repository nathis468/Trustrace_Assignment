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
            head.next=head;
        }
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.prev=curr;
            temp.next=head;
        }
        return head;
    }
    Node insert_at_any_pos(Node head,int num,int pos){
        Node temp=new Node(num);
        if(pos==1){
            Node curr=head;
            do{
                curr=curr.next;
            }
            while(curr.next!=head);
            head.prev=temp;
            temp.next=head;
            head=temp;
            curr.next=head;
        }
        else{
            int count=1;
            Node curr=head;
            Node bef=null;
            do{
                if(pos==count){
                    bef.next=temp;
                    temp.prev=bef;
                    temp.next=curr;
                    curr.prev=temp;
                    return head;
                }
                count++;
                bef=curr;
                curr=curr.next;
            }
            while(curr!=head);
            bef.next=temp;
            temp.prev=bef;
            temp.next=head;
        }
        return head;
    }
    Node remove_element(Node head,int num){
        if(head.data==num && head.next==head){
            head=null;
        }
        else if(head.data==num){
            Node curr=head;
            do{
                curr=curr.next;
            }
            while(curr.next!=head);
            curr.next=head.next;
            head=head.next;
        }
        else{
            Node curr=head;
            do{
                if(curr.data==num){
                    if(curr.next==head){
                        curr.prev.next=head;
                        break;
                    }
                    else{
                        curr.prev.next=curr.next;
                        curr.next.prev=curr.prev;
                        break;
                    }
                }
                curr=curr.next;
            }
            while(curr!=head);

        }
        return head;
    }
    Node replace(Node head,int num1,int num2){
        Node temp=new Node(num2);
        if(head.data==num1 && head.next==head){
            head=temp;
            head.next=head;
        }
        else if(head.data==num1){
            Node bef=null;
            Node curr=head;
            do{
                bef=curr;
                curr=curr.next;
            }
            while(curr!=head);
            bef.next=temp;
            temp.next=head.next;
            head.next.prev=temp;
            head=temp;
        }
        else{
            Node curr=head;
            Node bef=null;
            do{
                if(curr.data==num1){
                    temp.prev=bef;
                    temp.next=curr.next;
                    bef.next=temp;
                    if(curr.next!=head){
                        curr.next.prev=temp;
                    }
                }
                bef=curr;
                curr=curr.next;
            }
            while(curr!=head);
            
        }
        return head;
    }
    Node reverse(Node head){
        if(head.next==head){
            return head;
        }
        Node curr=head;
        Node temp=null;
        do{
            temp=curr.prev;   
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        while(curr!=head);
        head.next=temp.prev;
        head=temp.prev;
        return head;
    }
    void search_element(Node head,int num){
        int count=1;
        Node curr=head;
        do{
            if(curr.data==num){
                System.out.println("The given element is present at position : "+count);
                return;
            }
            count++;
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println("The given element is not present inside the list");
    }
    void print(Node head){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println();
    }
}

class DoublyCircularLinkedList1{
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
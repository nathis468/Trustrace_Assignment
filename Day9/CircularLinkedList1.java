import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Implementation{
    Node head;

    void insert_end(int num){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
            temp.next=head;
        }
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
        }

    }

    void insert_at_any_pos(int num,int pos){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
            head.next=head;
            return;
        }
        if(pos==1){
            Node curr=head;
            do{
                curr=curr.next;
            }
            while(curr.next!=head);
            curr.next=temp;
            temp.next=head;
            head=temp;

        }
        else{
            int count=1;
            Node prev=null;
            Node curr=head;
            do{
                if(count==pos){
                    prev.next=temp;
                    temp.next=curr;
                    return;
                }
                prev=curr;
                curr=curr.next;
                count++;
            }
            while(curr!=head);
            temp.next=curr.next;
            curr.next=temp;
        }
    }

    void remove_element(int num){
        Node prev=null;
        Node curr=head;
        if(head.data==num){
            do{
                if(curr.next==head){
                    curr.next=head.next;
                    break;
                }
                curr=curr.next;
            }
            while(curr!=head);
            head=head.next;
            return;
        }
        do{
            if(curr.data==num){
                prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        while(curr!=head);
    }
    
    void replace(int num1,int num2){
        Node temp=new Node(num2);
        Node prev=null;
        Node curr=head;
        if(head.data==num1){
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=head.next;
            head=temp;
            return;
        }
        do{
            if(curr.data==num1){
                prev.next=temp;
                temp.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        while(curr!=head);
    }

    void reverse(){
        if(head.next==head){
            return;
        }
        Node prev=null;
        Node curr=head;
        do{
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }   
        while(curr!=head);
        head.next=prev;
        head=prev;
    }

    void search_element(int num){
        Node curr=head;
        int count=1;
        do{
            if(curr.data==num){
                System.out.println("The element is present at position : "+count);
                return;
            }
            curr=curr.next;
            count++;
        }
        while(curr!=head);
        System.out.println("The given element is not found in the list");
    }

    void print(){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println();
    }
}


public class CircularLinkedList1{
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
                    im.insert_end(num);
                    break;
                
                case 2:
                    System.out.println("Enter the element to be inserted : ");
                    int num1=sc.nextInt();
                    System.out.println("Enter the position of the element to be inserted : ");
                    int pos=sc.nextInt();
                    im.insert_at_any_pos(num1, pos);
                    break;
                
                case 3:
                    System.out.println("Enter the element to be deleted : ");
                    int num2=sc.nextInt();
                    im.remove_element(num2);
                    break;          


                case 4:
                    System.out.println("Enter the element want to replace : ");
                    int num3=sc.nextInt();
                    System.out.println("Enter the element to be replaced of : ");
                    int num4=sc.nextInt();
                    im.replace(num3, num4);
                    break;

                case 5:
                    im.reverse();
                    break;

                case 6:
                    System.out.println("Enter the element want to search : ");
                    int num5=sc.nextInt();
                    im.search_element(num5);
                    break;

                case 7:
                    im.print();
                    break;

                case 8:
                    flag=1;
            }
        }
    }
}
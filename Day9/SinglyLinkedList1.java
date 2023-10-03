// traverse the linked list

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//     }
// }










// insert element at any position

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
//     Node insert_at_any_pos(Node head,int pos){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the element to be inserted : ");
//         Node temp=new Node(sc.nextInt());
//         Node prev=null;
//         Node curr=head;
//         int count=1;
//         if(pos==1){
//             temp.next=head;
//             head=temp;
//         }
//         else{
//             while(curr!=null){
//                 if(count==pos){
//                     prev.next=temp;
//                     temp.next=curr;
//                     break;
//                 }
//                 prev=curr;
//                 curr=curr.next;
//                 count++;
//             }
//         }
//         if(pos>count){
//             prev.next=temp;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the position to be inserted : ");
//         int pos=sc.nextInt();
//         head=in.insert_at_any_pos(head,pos);
//         p.print_list(head);
//     }
// }








// search an element in the linked list 

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
//     void search(Node head,int num){
//         int pos=1;
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==num){
//                 System.out.println("The given element is location in position : "+pos);
//                 return;
//             }
//             curr=curr.next;
//             pos++;
//         }
//         System.out.println("The given element is not loacted in the linked list");
//         return;
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the element to search for : ");
//         int num=sc.nextInt();
//         p.search(head,num);
//     }
// }









// remove a node at the any position

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class Remove{
//     Node remove_at_any_pos(Node head,int num){
//         if(head.data==num){
//             head=head.next;
//             return head;
//         }
//         Node prev=null;
//         Node curr=head;
//         while(curr.data!=num){
//             prev=curr;
//             curr=curr.next; 
//         }
//         prev.next=curr.next;
//         return head;
//     }
// }

// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         Remove rm=new Remove();
//         System.out.println("Element to remove : ");
//         int num=sc.nextInt();
//         head=rm.remove_at_any_pos(head,num);
//         p.print_list(head);
//     }
// }









// reverse the linked list

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class Reverse{
//     Node reverse_list(Node head){
//         Node prev=null;
//         Node curr=head;
//         while(curr!=null){
//             Node next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//         return head;
//     }
// }

// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         Reverse rs=new Reverse();
//         head=rs.reverse_list(head);
//         p.print_list(head);
//     }
// }









// replace an element 

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
//     Node replace_element(Node head,int num,int new_num){
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==num){
//                 curr.data=new_num;
//             }
//             curr=curr.next;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the element to be replaced of : ");
//         int num=sc.nextInt();
//         System.out.println("Enter the new element to replace : ");
//         int new_num=sc.nextInt();
//         head=in.replace_element(head,num,new_num);
//         p.print_list(head);
//     }
// }





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
        }
        return head;
    }

    Node insert_at_any_pos(Node head,int num1,int pos){
        Node temp=new Node(num1);
        Node prev=null;
        Node curr=head;
        int count=1;
        if(pos==1){
            temp.next=head;
            head=temp;
        }
        else{
            while(curr!=null){
                if(count==pos){
                    prev.next=temp;
                    temp.next=curr;
                    break;
                }
                prev=curr;
                curr=curr.next;
                count++;
            }
        }
        if(pos>count){
            prev.next=temp;
        }
        return head;
    }

    Node remove_element(Node head,int num){
        if(head.data==num){
            head=head.next;
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr.data!=num){
            prev=curr;
            curr=curr.next; 
        }
        prev.next=curr.next;
        return head;
    }

    Node replace(Node head,int num,int new_num){
        Node curr=head;
        while(curr!=null){
            if(curr.data==num){
                curr.data=new_num;
            }
            curr=curr.next;
        }
        return head;
    }

    Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    
    void search_element(Node head,int num){
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==num){
                System.out.println("The given element is location in position : "+pos);
                return;
            }
            curr=curr.next;
            pos++;
        }
        System.out.println("The given element is not loacted in the linked list");
        return;
    }

    Node swap_elements(Node head,int val1,int val2){
        if (val1 == val2)
            return head;
        Node curr1 = null, prev1 = head;
        while (prev1 != null && prev1.data != val1) {
            curr1 = prev1;
            prev1 = prev1.next;
        }
 
        Node prev2 = null, curr2 = head;
        while (curr2 != null && curr2.data != val2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }
 
        if (prev1 == null || curr2 == null)
            return head;
 
        if (curr1 != null)
            curr1.next = curr2;
        else
            head = curr2;
 
        if (prev2 != null)
            prev2.next = prev1;
        else 
            head = prev1;
 
        Node temp = prev1.next;
        prev1.next = curr2.next;
        curr2.next = temp;
        return head;
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

class SinglyLinkedList1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        Node head=null;

        int flag=0;
        while(flag==0){
            System.out.println("\nEnter your choice : \n1.Add element at the end \n2.Add element at any position \n3.Remove element at any position \n4.Replace an element \n5.Reverse a list \n6.Search an element \n7.Print the list \n8. Swap elements \n9.Exit \n");
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
                    System.out.println("Enter the positions want to swap : ");
                    int val1=sc.nextInt();
                    int val2=sc.nextInt();
                    im.swap_elements(head,val1,val2);
                    break;

                case 9:
                    flag=1;
            }
        }

    }
}
import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class Implementation 
{
   
    StackNode top;
    
    void push(int a) 
    {
        StackNode temp=new StackNode(a);
        if(top==null){
            top=temp;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }
    
    int pop() 
    {
        if(top==null){
            return -1;
        }
        else if(top.next==null){
            int num=top.data;
            top=null;
            return num;
        }
        else{
            int num=top.data;
            top=top.next;
            return num;
        }
    }

    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek element is : "+top.data);
        }
    }

    void print(){
        StackNode curr=top;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

class Stack1 {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        StackNode top=null;

        int flag=0;
        while(flag==0){
            System.out.println("\nEnter your choice : \n1.Push the element \n2.Pop the element \n3.Display peek element \n4.Print the Queue \n5.Exit \n");
            int input=sc.nextInt();
            switch(input){
                case 1:
                    im.push(sc.nextInt());
                    break;

                case 2:
                    im.pop();
                    break;

                case 3:
                    im.peek();
                    break;

                case 4:
                    im.print();
                    break;

                case 5:
                    flag=1;
            }
        }

    }
}
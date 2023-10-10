import java.util.Scanner;

class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class Implementation{
    QueueNode front, rear;
    
	void enqueue(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    if(front==null){
	        front=temp;
	        rear=temp;
	    }
	    else{
	        rear.next=temp;
	        rear=temp;
	    }
	}
	
	int dequeue()
	{
        if(front==null){
            return -1;
        }
        else{
            int num=front.data;
            front=front.next;
            return num;
        }
	}

    void peek(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Peek element is : "+front.data);
        }
    }

    void print(){
        QueueNode curr=front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}




class Queue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Implementation im=new Implementation();

        int flag=0;
        while(flag==0){
            System.out.println("\nEnter your choice : \n1.Enqueue the element \n2.Dequeue the element \n3.Display peek element \n4.Print the Queue \n5.Exit \n");
            int input=sc.nextInt();
            switch(input){
                case 1:
                    im.enqueue(sc.nextInt());
                    break;

                case 2:
                    im.dequeue();
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





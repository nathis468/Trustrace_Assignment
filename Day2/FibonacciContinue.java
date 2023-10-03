package Day2;
// usinng recursion

import java.math.BigInteger;
import java.util.Scanner;

class FibonacciContinue{
    static BigInteger finalNo1=new BigInteger("0");
    static BigInteger finalNo2=new BigInteger("1");
    static void fibonacciPrint(BigInteger prev,BigInteger current,int end){
        if(end>0){
            System.out.println(prev);
            BigInteger next=prev.add(current);
            prev=current;
            current=next;
            end--;
            fibonacciPrint(prev,current,end);
        }
        else{
            finalNo1=prev;
            finalNo2=current;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        fibonacciPrint(new BigInteger("0"),new BigInteger("1"),end);
        int choice=1;
        while(choice==1){
            System.out.println("Enter 1 to print next sequence or 0 to exit : ");
            choice=sc.nextInt();
            if(choice==0){
                break;
            }
            end=sc.nextInt();
            fibonacciPrint(finalNo1,finalNo2,end);
        }
    }
}


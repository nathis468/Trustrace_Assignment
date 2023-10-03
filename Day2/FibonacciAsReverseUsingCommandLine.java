package Day2;
// using recursion

import java.math.BigInteger;

class FibonacciAsReverseUsingCommandLine{
    static void fibonacciPrint(BigInteger prev,BigInteger current,int end){
        if(end>0){
            BigInteger next=prev.add(current);
            prev=current;
            current=next;
            end--;
            fibonacciPrint(prev,current,end);
            System.out.println(current);
        }
    }

    public static void main(String args[]){
        int end=Integer.parseInt(args[0]);
        fibonacciPrint(new BigInteger("-1"),new BigInteger("1"),end);
    }
}


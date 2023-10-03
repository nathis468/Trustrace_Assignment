package Day2;
// usinng recursion
import java.math.BigInteger;

class FibonacciUsingCommandLine{
    static void fibonacciPrint(BigInteger prev,BigInteger current,int end){
        if(end>0){
            System.out.println(prev);
            BigInteger next=prev.add(current);
            prev=current;
            current=next;
            end--;
            fibonacciPrint(prev,current,end);
        }
    }

    public static void main(String args[]){
        int end=Integer.parseInt(args[0]);
        fibonacciPrint(new BigInteger("0"),new BigInteger("1"),end);
    }
}


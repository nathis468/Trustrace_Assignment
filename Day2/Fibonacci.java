package Day2;
import java.util.Scanner;

class Fibonacci{
    static int fibonacciPrint(int end){
        if(end==1){
            return 0;
        }
        else if(end==2 || end==3){
            return 1;
        }
        else{
            return fibonacciPrint(end-1)+fibonacciPrint(end-2);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        System.out.println(fibonacciPrint(end));
    }
}


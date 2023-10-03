package Day2;
import java.util.Scanner;

class ButterflyPatternUsingLoop{
    static void Print(int ){
        if(){
            for(int )
        }
        else{
            
        }
    }
    static void PatternPrint(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }   
            System.out.println();     
        }
        for(int k=1;k<=n;k++){
            for(int l=k;l<=n;l++){
                System.out.print("-");
            }
            for(int l=1;l<k;l++){
                System.out.print(" ");
            }
            for(int l=1;l<k;l++){
                System.out.print(" ");
            }
            for(int l=k;l<=n;l++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PatternPrint(n);
    }
}
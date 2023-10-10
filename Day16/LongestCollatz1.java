import java.util.*;

class Implementation{
    void normal_method(int range){
        long greater_num=1;
        long max_chain=1;
        for(long i=1;i<range;i++){
            long count=1;
            long num=i;
            while(num>1){
                if(num%2==0){
                    num=num/2;
                }
                else{
                    num=3*num+1;
                }
                count++;
            }
            if(count>max_chain){
                greater_num=i;
                max_chain=count;
            }
        }
        System.out.println("The number "+greater_num+" has a longest chain of : "+max_chain);
    }
}
class LongestCollatz1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range to calculate : ");
        int range=sc.nextInt();
        Implementation im=new Implementation();
        im.normal_method(range);
    }
}
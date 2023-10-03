import java.util.*;

class Implementation{
    void optimized_method(int range){
        HashMap<Long,Long> hm=new HashMap<>();
        long greater_num=1;
        long max_chain=1;
        for(long i=1;i<1000000;i++){
            long count=1;
            long num=i;
            while(num>1){
                if(num%2==0){
                    num=num/2;
                }
                else{
                    num=3*num+1;
                }
                if(hm.containsKey(num)){
                    count+=hm.get(num);
                    break;
                }
                count++;
            }
            if(count>max_chain){
                greater_num=i;
                max_chain=count;
            }
            hm.put(i,count);
        }
        System.out.println("The number "+greater_num+" has a longest chain of : "+max_chain);

    }
}
public class LongestCollatz2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range to calculate : ");
        int range=sc.nextInt();
        Implementation im=new Implementation();
        im.optimized_method(range);
    }

}

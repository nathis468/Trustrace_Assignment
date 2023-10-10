import java.util.*;

class Sort{
    void bubble_sort_reverse(int arr[]){
        boolean swap=false;
	    for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
	}
    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class BubbleSortReverse1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort s=new Sort();
        s.print_array(arr);
        s.bubble_sort_reverse(arr);
        s.print_array(arr);
    }
}
import java.util.*;

class Sort{
    void selection_sort(int arr[]){
	    for(int i=0;i<arr.length-1;i++){
	        int cmp=i;
	        for(int j=i+1;j<arr.length;j++){
                if(arr[cmp]>arr[j]){
                    cmp=j;
                }
            }
            int temp=arr[cmp];
            arr[cmp]=arr[i];
            arr[i]=temp;
	    }

        // or

        // for(int i=0;i<arr.length-1;i++){
	    //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[i]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
	    // }
	}
    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class SelectionSort1 {
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
        s.selection_sort(arr);
        s.print_array(arr);
    }
}

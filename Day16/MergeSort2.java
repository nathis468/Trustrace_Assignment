// not using extra space for merging

import java.util.Scanner;

class Sort{
    void merge(int arr[], int l, int m, int r){
        int i=l;
        int j=m;
        while(j<r){
            while(arr[j+1]>arr[i]){
                i++;
            }
            int temp=arr[j+1];
            int x=j;
            while(x>=i){
                arr[x+1]=arr[x];
                x--;
            }
            arr[i]=temp;
            i++;
            j++;
        }
    }

    void merge_sort(int arr[], int l, int r){
        int mid=(l+r)/2;
        if(l<r){
            merge_sort(arr,l,mid);
            merge_sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class MergeSort2{
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
        s.merge_sort(arr,0,n-1);
        s.print_array(arr);
    }
}

// using extra space for merging

import java.util.Scanner;

class Sort{
    void merge(int arr[], int l, int m, int r){
        int temp1[]=new int[m-l+1];
        int temp2[]=new int[r-m];
        for(int i=0;i<temp1.length;i++){
            temp1[i]=arr[l+i];
        }
        for(int i=0;i<temp2.length;i++){
            temp2[i]=arr[m+1+i];
        }
        
        int i=0;
        int j=0;
        int k=l;
        while(i<temp1.length && j<temp2.length){
            if(temp1[i]<=temp2[j]){
                arr[k]=temp1[i];
                i++;
            }
            else{
                arr[k]=temp2[j];
                j++;
            }
            k++;
        }
        while(i<temp1.length){
            arr[k]=temp1[i];
            i++;
            k++;
        }
        while(j<temp2.length){
            arr[k]=temp2[j];
            j++;
            k++;
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

public class MergeSort1{
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

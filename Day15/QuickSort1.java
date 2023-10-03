// by taking last index as pivot

import java.util.Scanner;

class Sort{
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void quick_sort(int arr[], int low, int high)
    {
        int j;
        if(low<high){
            j=partition(arr,low,high);
            quick_sort(arr,low,j-1);
            quick_sort(arr,j+1,high);
        }
    }
    int partition(int arr[], int low, int high)
    {
        int pivot=high;
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=arr[pivot] && i<high){
                i++;
            }
            while(arr[j]>arr[pivot] && j>low){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,pivot);
        return j;  
    } 
    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class QuickSort1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sort s=new Sort();
        System.out.println("Array before sorting : ");
        s.print_array(arr);
        s.quick_sort(arr,0,(n-1));
        System.out.println("Array after sorting : ");
        s.print_array(arr);
    }
}


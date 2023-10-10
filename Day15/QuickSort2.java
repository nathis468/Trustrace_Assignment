// by taking middle index as pivot

import java.util.Scanner;

class Sort{
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void quick_sort(int arr[], int low, int high)
    {
        int i;
        if(low<high){
            i=partition(arr,low,high);
            quick_sort(arr,low,i-1);
            quick_sort(arr,i,high);
        }
    }
    int partition(int arr[], int low, int high)
    {
        int mid_index=(high+low)/2;
        int pivot=arr[mid_index];
        int i=low;
        int j=high;
        while(i<=j){
            while(arr[i]<pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return i;
        
    } 
    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class QuickSort2{
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


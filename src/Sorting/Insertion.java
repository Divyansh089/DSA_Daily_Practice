package Sorting;

public class Insertion {
    public static void main(String args[]){
        int arr[] = { 1 ,2, 5, 7, 8,  1,5, 43, 2, 2};
        sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void sort(int [] arr){
        for(int i  = 0;i<arr.length;i++){
            insertElement(arr , i);
        }
    }
    public static void insertElement(int [] arr , int i){
        int ele  = arr[i];
        int j = i - 1;
        while(j>=0 && arr[j] > ele){
            arr[j +1] = arr[j];
            j--;
        }
        arr[j+1] = ele;
    }
}

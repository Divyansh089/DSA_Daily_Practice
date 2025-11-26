package BinarySearch;

public class BinSearch {

    public static void main(String args[]){
        int arr []= {1,2,3,4,5,6,7,8,9};
        System.out.println(Search(arr , 5));
    }

    public static int Search(int arr[] , int n){
        int start = 0 , end = arr.length - 1;
        while(start  <= end){
            int mid =(start  + end)/2;
            if(arr[mid] == n){
                return mid;
            }else if(arr[mid] > n){
                end  = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}

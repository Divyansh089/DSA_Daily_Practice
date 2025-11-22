package Sorting;

public class Selection {
    public static void main(String args[]){
        int [] arr = { 4, 5, 3, 2, 1};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int j = min(arr , i);
            int temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static int min(int [] arr  , int i ){
        int idx = i;
        for(int j = idx + 1;j<arr.length;j++){
            if(arr[j] < arr[idx]){
                idx = j;
            }
        }
        return idx;
    }
}

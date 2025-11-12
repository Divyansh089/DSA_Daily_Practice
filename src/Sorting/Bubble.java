package Sorting;

public class Bubble {
    public static void main(String args[]){
        int []arr = {4 , 5 , 3, 2, 1};
        int n  = arr.length;

        for(int i = 1;i<n;i++){
            for(int j  = 0 ;j<n - i;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}

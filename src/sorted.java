public class sorted { // find is the given array is sorted in strictly increasing order
    public static boolean isSorted(int[] arr , int n){
        if(n == arr.length -1){
            return true;
        }
        if(arr[n] < arr[n + 1]){
            return isSorted(arr , n+1);
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr , 0));
    }
}

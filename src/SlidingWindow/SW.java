package SlidingWindow;

public class SW {
    public static void main(String args[]){
        int [] arr ={2 , 1, 3, 4, 7, 2, 6, 4, 5};
        int sum  =0, ans = 0 , k =3;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        for(int j  = k;j<arr.length;j++){
            sum +=arr[j]; // grow window
            sum -=arr[j-3]; // shrink window
            ans = Math.max(sum , ans);
        }

        System.out.println(ans);

    }
}

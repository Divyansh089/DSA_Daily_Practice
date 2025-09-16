package HashMap;

import java.util.*;

public class SetFunctions {
    public static void main(String args[]){
        int [] arr1 = {7 , 3 , 9};
        int [] arr2 = {6 , 3, 9, 2, 9, 4};
        //union(arr1, arr2);
        for(int a: intersection(arr1 , arr2)){
            System.out.print(a +",");
        }
    }

    public static void union(int [] arr1 , int []arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j = 0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        for(int a: set){
            System.out.print(a + ",");
        }
    }
    public static HashSet<Integer> intersection(int [] arr1 , int [] arr2){
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i = 0;i<arr1 .length;i++){
            set1.add(arr1[i]);
        }
        for(int j  = 0;j< arr2.length;j++){
            if(set1.contains(arr2[j])){
                ans.add(arr2[j]);
                set1.remove(arr2[j]);
            }
        }
        return ans;

    }
}

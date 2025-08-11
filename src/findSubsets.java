import java.util.ArrayList;

public class findSubsets { //find all the possible subSets of the n natural number.
    public static void printArr(ArrayList<Integer> arr){
        for(int i  = 0 ; i < arr.size(); i++){
            System.out.print(arr.get(i) + " " + ",");
        }
        System.out.println();
    }
    public static void subSets(int []n  ,int i , ArrayList<Integer> arr){
//        if(n==0){
//            printArr(arr);
//            return;
//        }
//        arr.add(n);
//        subSets(n-1 , arr);
//
//        arr.remove(arr.size() - 1);
//        subSets(n-1 , arr);
        if(i == n.length ){
            printArr(arr);
            return;
        }
        arr.add(n[i]);
        subSets( n  , i +1 , arr);
        arr.remove(arr.size() - 1);
        subSets(n , i +1 , arr);
    }
    public static void main(String [] args){
        int []n= {1,2,3};
        ArrayList<Integer> arr = new ArrayList<>();
        subSets(n , 0 , arr);
    }
}

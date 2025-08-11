public class MaxRowSum {
    public static void main(String []args){
        int [][] matrix = {{1, 2 , 3 ,4 , 5} , {6 , 7 , 8 , 0 , 1} ,{2 , 3, 4 , 5, 6}, {7, 8, 9, 0, 1} };
        int maxSum = 0, row = 0;
        for(int i  = 0; i< matrix.length;i++){
            int sum  = 0;
            for(int j = 0 ; j< matrix[i].length;j++){
                sum += matrix[i][j];
            }
            if(sum > maxSum){
                row = i+1;
                maxSum = sum;
            }
        }
        System.out.println("Row = " + row + " and maximum sum  = " + maxSum);
    }
}

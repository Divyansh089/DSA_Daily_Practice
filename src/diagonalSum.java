public class diagonalSum {
    public static void main(String [] args){
        int [][] matrix = {{1, 2 , 3 ,4 , 5} , {6 , 7 , 8 , 0 , 1} ,{2 , 3, 4 , 5, 6}, {7, 8, 9, 0, 1} , {2 ,3 , 4 , 5 , 6} };
        int sum = 0 , n = matrix.length;
        for(int i = 0 ;i< n;i++){
            sum += matrix[i][i];
            if(i != n - 1 - i){
                sum += matrix[i][n - 1 - i];
            }
        }
        System.out.println(sum);
    }
}

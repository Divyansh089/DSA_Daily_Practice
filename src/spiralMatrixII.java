public class spiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int [][] ans = new int [n][n];
        if(n == 1) {
            ans[0][0] = 1;
            return ans;
        }
        int sRow = 0 , sCol= 0 , eRow = n-1 , eCol = n-1;
        int count = 1;
        while(sRow <= eRow && sCol <= eCol){
            //top
            for(int j = sCol ;j<=eCol;j++){
                ans[sRow][j] =count;
                count++;
            }
            //right
            for(int j  = sRow +1;j<=eRow;j++){
                ans[j][eCol] = count;
                count++;
            }
            //bottom
            for(int j  = eCol -1;j>=sCol;j--){
                if(sRow == eRow) break;
                ans[eRow][j] = count;
                count++;
            }
            //left
            for(int j = eRow -1;j>=sRow+1;j--){
                if(sCol == eCol) break;
                ans[j][sCol] =count;
                count++;
            }
            sRow++; eRow--;sCol++;eCol--;
        }
        return ans;
    }
    public static void main(String [] args){
        int n = 3;
        print(generateMatrix(n) , n);
    }
    public static void print(int[][] matrix ,int n){
        for(int i  = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

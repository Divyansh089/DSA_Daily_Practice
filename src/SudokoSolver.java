public class SudokoSolver {
    public static char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
    };
    public static void main(String [] args){

        if(helper(board , 0 , 0 )){
            printBoard(board);
        }else{
            System.out.println("No solution exists...");
        }

    }
    public static void printBoard(char [][] board){
        for(int i  = 0; i< 9 ;i++){
            for(int j = 0; j <9;j++){
                System.out.print(board[i][j] + " " +",");
            }
            System.out.println();
        }
    }
    public static boolean helper(char [][]board , int row , int col ){
        if(row == board.length){
            return true;
        }
        int nRow = 0  , nCol = 0;
        if(col != board.length -1 ){
            nRow = row;
            nCol = col + 1;

        }else{
            nRow = row + 1;
            nCol = 0;
        }

        if(board[row][col] != '.'){
            return helper(board , nRow , nCol);

        }else{
            for(int i  = 1 ; i<=9; i++){
                if(isSafe(board , row , col , i)){
                    board[row][col] = (char)(i +'0');
                    if(helper(board , nRow , nCol)) {
                        return true;
                    }else{
                        board[row][col] = '.';

                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char [][]board , int row , int col , int i){
        for(int j  = 0 ; j< board.length ; j++){ //horizontal and vertical
            if(board[j][col] == (char)(i + '0')) return false;
            if(board[row][j] == (char)(i + '0')) return false;
        }


        int sRow = (row/3) *3, sCol = (col/3) * 3;
        for(int j  =sRow; j < sRow +3;j++){
            for(int k = sCol;k < sCol + 3;k++){
                if(board[j][k] == (char) (i + '0')) return false;
            }

        }
        return true;
    }
}

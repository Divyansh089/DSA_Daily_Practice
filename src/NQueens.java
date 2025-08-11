
import java.util.*;
public class NQueens {
    public static void main(String [] args){
        int n  = 8;
        printAllBoard(solveNQueens(n));
    }
    public static void  printAllBoard(List<List<String>> boards){
        for(int i= 0; i<boards.size();i++){
            List<String> board = new ArrayList<>(boards.get(i));
            for(int j  = 0 ; j < board.size() ; j++){
                for(int k = 0 ;k< board.size();k++){
                    System.out.print(board.get(j).charAt(k) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Below is the LeetCode Version
    public static List<List<String>> solveNQueens(int n ){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board , allBoards , 0);
        return allBoards;

    }
    public static void helper(char[] [] board , List<List<String>> allBoards , int col){
        if(col == board.length){
            saveBoard(board , allBoards);
            return;
        }
        for(int row  = 0 ;row< board.length;row++){
            if(isSafe(board , row , col)){
                board[row][col] ='Q';
                helper(board ,allBoards , col + 1);
                board[row][col] ='.';
            }
        }
    }

    public static void saveBoard(char [][] board , List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i  = 0  ; i < board.length;i++){
            row="";
            for(int j = 0;j< board.length;j++){
                if(board[0][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    public static boolean isSafe(char [][]board , int row , int col){
        for(int i = 0 ; i< board.length ;i++){ //horizontal
            if(board[row][i] == ( 'Q')){
                return false;
            }
        }

        for(int i = 0 ;i<board.length;i++){ //vertical
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int c = col ,r = row;c >= 0 && r >= 0; c-- , r--){// upper left
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        for(int c = col , r = row ; r >= 0 && c < board.length;r-- , c++){ // upper right
            if(board[r][c] == 'Q') return false;
        }

        for(int c= col , r = row ; r< board.length && c>= 0 ;r++ , c--){ // lower left
            if(board[r][c] == 'Q') return false;
        }

        for(int c = col , r = row ; r < board.length && c < board.length; r++  , c++){ // lower right
            if(board[r][c] == 'Q') return false;
        }

        return true;
    }
}

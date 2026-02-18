package BackTracking;

public class Total_queens {
    static int c = 0;
    public static void main(String args[]){
        int tq = 2;
        int n = 4;
        boolean board[] = new boolean[n];
        back(board , tq ,0  , "");
        System.out.println("Total possible way:"+c);
    }
    public static void back(boolean[] board , int tq , int tqsf , String ans){
        if(tqsf == tq){
            c++;
            System.out.println(ans);
            return;
        }

        for(int i = 0;i<board.length;i++){
            if(board[i] ==false){
                board[i] = true;
                back(board , tq , tqsf+1 , ans + "b" + i + "q" + tqsf);
                board[i] = false; // undo (main thing to complete the backtrack)
            }
        }
    }
}

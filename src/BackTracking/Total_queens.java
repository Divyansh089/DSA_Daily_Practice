package BackTracking;

public class Total_queens {
    static int c = 0;
    public static void main(String args[]){
        int tq = 2;
        int n = 4;
        boolean board[] = new boolean[n];
        //permutation(board , tq ,0  , "");
        //System.out.println("Total possible way:"+c);
        combination(board ,tq , 0 , "" , 0);
        System.out.println("Total possible way:"+c);
    }
    public static void permutation(boolean[] board , int tq , int tqsf , String ans){
        if(tqsf == tq){
            c++;
            System.out.println(ans);
            return;
        }

        for(int i = 0;i<board.length;i++){
            if(board[i] ==false){
                board[i] = true;
                permutation(board , tq , tqsf+1 , ans + "b" + i + "q" + tqsf);
                board[i] = false; // undo (main thing to complete the backtrack)
            }
        }
    }


    public static void combination(boolean[] board , int tq , int tqsf , String ans ,int idx){
        if(tqsf == tq){
            c++;
            System.out.println(ans);
            return;
        }

        for(int i = idx;i<board.length;i++){
            if(board[i] ==false){
                board[i] = true;
                combination(board , tq , tqsf+1 , ans + "b" + i + "q" + tqsf , i + 1);
                board[i] = false; // undo (main thing to complete the backtrack)
            }
        }
    }
}

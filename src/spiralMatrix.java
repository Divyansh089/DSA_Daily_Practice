import java.util.*;
public class spiralMatrix {
    public static void main(String []args){
        int [][] matrix = {
                {1, 2 , 3 ,4 , 5} ,
                {6 , 7 , 8 , 0 , 1} ,
                {2 , 3, 4 , 5, 6},
                {7, 8, 9, 0, 1} ,
                {2 ,3 , 4 , 5 , 6} };
        int m  = matrix.length, n = matrix[0].length;
        int sRow = 0 , sCol = 0 , eRow = m-1, eCol = n-1;
        List<Integer> store = new ArrayList<>();
        while(sRow <= eRow && sCol <= eCol){
            //top
            for(int j  = sCol;j<=eCol;j++){
                store.add(matrix[sRow][j]);
            }
            //right
            for(int j = sRow + 1;j <=eRow;j++){
                store.add(matrix[j][eCol]);
            }
            //bottom
            for(int j = eCol - 1;j >=sCol;j--){
                if(sRow == eRow) break;
                store.add(matrix[eRow][j]);
            }
            //left
            for(int j  = eRow -1 ;j >=sRow + 1;j--){
                if(sCol == eCol) break;
                store.add(matrix[j][sCol]);
            }
            sRow++; sCol++ ;eRow-- ; eCol-- ;
        }
        for(int i = 0;i< store.size();i++){
            System.out.print(store.get(i) + " -> " );

        }
        System.out.println("\n"+store.size());
    }
}

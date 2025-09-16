package CF;

import java.util.Scanner;

public class Matrix {
    public static void main(String args[]){
        int [][] grid = new int [5][5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int c = 0;
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                if(grid[i][j] == 1){
                    c = Math.abs(i - 2) + Math.abs(j-2);
                    break;
                }

            }
        }
        System.out.println(c);
    }
}

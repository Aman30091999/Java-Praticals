package sudo;

import java.util.Arrays;

public class Sudo {
    public static void main(String[] args) {
        int[][] board={{8,0,0,0,0,0,0,0,0},{0,0,3,6,0,0,0,0,0},
        {0,7,0,0,9,0,2,0,0},{0,5,0,0,0,7,0,0,0},{0,0,0,0,4,5,7,0,0},
        {0,0,0,1,0,0,0,3,0},{0,0,1,0,0,0,0,6,8},{0,0,8,5,0,0,0,1,0},
        {0,9,0,0,0,0,4,0,0}};
        sudo(board,0,0);
    }
    public static void sudo(int[][] board, int row,int col){
        if(row==9){
            for(int i=0;i<9;i++){
                System.out.println(Arrays.toString(board[i]));
            }
            return;
        }
        if(col==9){
            sudo(board,row+1,0);
            return ;
        }
        if(board[row][col]==0){
            //processing
            for(int i=1;i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=i;
                    sudo(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }
        else{
            sudo(board,row,col+1);
        }
    }
    public static boolean isSafe(int[][] board,int row,int col,int value){
        for(int i=0;i<9;i++){
            if(board[row][i]==value){
                return false;
            }
        }
        for(int r=0;r<9;r++){
            if(board[r][col]==value){
                return false;
            }
        }
        int rowChunk=row/3;
        int colChunk=col/3;
        for(int r=rowChunk*3;r<(rowChunk+1)*3;r++){
            for(int c=colChunk*3;c<(colChunk+1)*3;c++){
                if(board[r][c]==value){
                    return false;
                }
            }
        }
        return true;
    }
}

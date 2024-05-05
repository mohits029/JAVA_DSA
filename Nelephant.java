public class Nelephant {

    public static boolean isSafe(char board[][], int row, int col){
        //left 
        for(int j= col-1; j>=0; j--){
            if(board[row][j]=='E'){
                return false;
            }
        }
        //right
        for(int j=col+1; j<board.length; j++){
            if(board[row][j]=='E'){
                return false;
            }
        }
        //up
        for(int i= row-1; i>=0; i--){
            if (board[i][col]=='E') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("---------chees board-----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void n_elephent(char board[][], int row){
        //base case
        if(row== board.length){
            printBoard(board);
            return;
        }
        else{
            for(int j=0; j<board.length; j++){
                if(isSafe(board,row, j)){
                    board[row][j]= 'E';
                    n_elephent(board, row+1);
                    board[row][j]= 'X';
                }
            }
        }
    }


    public static void main(String args[]){
        int n=4;
        char board[][]= new char[n][n];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]= 'X';
            }
        }

        n_elephent(board,0);
    }
}

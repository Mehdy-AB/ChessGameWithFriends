//this file is place holder for until we figure out the ghraphics for the project 
//this is for running the game in the cnosole 
public class chess {
    public static void main(String[] args){
        //creating a new board with the starting position 
        board MyBoard=new board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        print(MyBoard.board);
    }
    //printing the board
    public static void print(char board[][]){
        for(int j=7;0<=j;j--){
            for(int i=0;i<8;i++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

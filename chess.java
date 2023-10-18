public class chess {
    public static void main(String[] args){
        board MyBoard=new board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        print(MyBoard.board);
    }
    public static void print(char board[][]){
        for(int j=7;0<=j;j--){
            for(int i=0;i<8;i++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

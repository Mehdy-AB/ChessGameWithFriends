public class board {
    public char[][] board=new char[8][8];
    //creates a new from a "Forsyth–Edwards Notation" postion code 
    public board(String code){
        int i,j,k;
        i=0;j=7;
        for(k=0;code.charAt(k)!=' ';k++){
            if(code.charAt(k)=='/'){
                i=0;
                j--;
                continue;
            }
            if((code.charAt(k)>48)&&(code.charAt(k)<57)){
                i+=code.charAt(k)-48;
                continue;
            }
            board[i][j]=code.charAt(k);
            i++;
        }
    }
    
}   



public class word_search {
    static char board[][] ={
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','F'},
    };
    static boolean isvalid= false;
    public static boolean searchword(String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(isMatch(i,j,word)){
                    return true;
                }
            }
        }
        return false;
   
    }
    public static boolean isMatch(int row,int col,String word){
        // word matched
        if(word.length()==0){
            return true;
        }
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(0)){
            return false;
        }
        int directions[][]={
            {0,1},  // right
            {1,0},  // down
            {0,-1}, // left
            {-1,0}  // top
        };
        board[row][col]='#';
        
        for(int direction = 0;direction<directions.length;direction++){
            int rowDirection = directions[direction][0];
            int colDirection = directions[direction][1];
            isvalid = isMatch(row+rowDirection,col+colDirection,word.substring(1));
            if(isvalid){
                break;
            }
        }

        board[row][col] = word.charAt(0);
        return isvalid;
    }
    public static void main(String[] args) {
        String word= "ABCCED";
        System.out.println(searchword(word));
    }
}
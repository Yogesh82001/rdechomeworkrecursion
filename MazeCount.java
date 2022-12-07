import java.util.ArrayList;
public class MazeCount{
    static int count(int row,int col,int endRow,int endcol){
        if(row>endRow){
            return 0;
        }
        if (col>endcol) {
            return 0;
        }
        if (row==endRow && col==endcol) {
            return 1;
        }
        return count(row+1, col, endRow, endcol)+count(row, col+1, endRow, endcol);
    }
    public static void main(String[] args) {
        
        System.out.println(MazeCount.count(0,0,2,2));
    }
}

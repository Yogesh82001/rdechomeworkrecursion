import java.util.ArrayList;

public class mazeplayer {
    
static ArrayList<String> playerInMaze(int row,int col,int endRow,int endcol){
    if(row>endRow){
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
    if (col>endcol) {
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
    if (row==endRow && col==endcol) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        return list;
    }
    ArrayList<String> finalResult = new ArrayList<>();
    // For Down Step
    ArrayList<String> list = playerInMaze(row+1, col, endRow, endcol);
    for (String temp : list) {
        finalResult.add(temp+"D");
    }
    // For Right Step
    list = playerInMaze(row, col+1, endRow, endcol);
    for (String temp : list) {
        finalResult.add(temp+"R");
    }
    // For DIagonal Step    diagonal ----> g
    list = playerInMaze(row+1, col+1, endRow, endcol);
    for (String temp : list) {
        finalResult.add(temp+"g");
    }
    return finalResult;
}
public static void main(String[] args) {

    System.out.println(playerInMaze(0, 0, 2, 2));
}
}

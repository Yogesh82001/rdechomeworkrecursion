public class RatInMaze{
    public static int getCount(int [][] maze,int row,int col) {
        if(row==maze.length-1&&col==maze.length-1){
            return 1;
        }
        if(row>maze.length -1||col >maze.length-1 || maze[row][col] ==0 ){
            return 0;
        }
        return getCount(maze, row, col+1)+getCount(maze, row+1, col);
    }
    public static void main(String[] args) {
        int [][] maze ={
            {1,1,1,1},
            {1,1,0,1},
            {0,1,1,1},
            {0,1,1,1},
        };
        System.out.println(RatInMaze.getCount(maze, 0, 0));
}
}
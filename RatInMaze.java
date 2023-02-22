public class RatInMaze {
    public static void main(String[] args) {
        int n=5;
        int [][] maze = new int[n][n];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j]=1;
            }
        }
        maze[1][0]=0;
        maze[1][2]=0;
        System.out.println(ratInMaze(maze, 0, 0, n));
    }
    public static int ratInMaze(int[][]maze,int row,int col,int n) {
        if(row==n || col==n){
            return 0;
        }else if(row==n-1&&col==n-1){
            return 1;
        }
        if(maze[row][col]==0){
            return 0;
        }
        return ratInMaze(maze,row+1,col,n)+ratInMaze(maze,row,col+1,n);
    }
}

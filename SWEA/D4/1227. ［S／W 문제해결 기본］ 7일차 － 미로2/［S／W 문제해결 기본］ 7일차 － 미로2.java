import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Queue;
import java.util.LinkedList;

class Solution
{
    
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public static int bfs(int[][] map, int x, int y) {
     
        boolean[][] visited = new boolean[100][100];
        Queue<Pair> queue = new LinkedList<>();
   
        visited[x][y] = true;
        queue.add(new Pair(x,y));
        
        while(!queue.isEmpty()) {
        	Pair temp = queue.poll();
            
            for(int i = 0; i <4; i++) {
            	int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                
                if(nx < 0 || nx >= 100 || ny < 0 || ny >= 100 || visited[nx][ny]) continue;
                
                if(map[nx][ny] == 0 ) {
                	visited[nx][ny] = true;
                    queue.add(new Pair(nx, ny));
                } else if(map[nx][ny] == 3) {
                    
                    return 1;
                }
            }
        }
        
        return 0;
    
    }
    public static class Pair {
        
        int x;
        int y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc <= 10; tc++) {
            
            int T = sc.nextInt();
           int[][] map = new int[100][100];
            
            
            int x = 0;
            int y = 0;
            
            //인접행렬 생성
            for(int i = 0; i < 100; i++) {
                String str = sc.next();
                for(int j = 0; j < 100; j++) {
                    int n = str.charAt(j) - '0';// Integer.valueOf(Character.toString(str.charAt(j)));
                    map[i][j] = n;                 
                    
                    if(map[i][j] == 2) {
                        x = i; //1
                        y = j; //1
                    }
              }
            }
        
            int ans = bfs(map, x, y);
            
            System.out.println("#" + tc + " " + ans);
          
        }
    }
}
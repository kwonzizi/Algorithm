
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc <= 10; tc++) {
        	int T = sc.nextInt();
            int[][] arr = new int [100][100];
            
            for(int i = 0; i< 100; i++) {
                for(int j =0 ; j < 100; j++) {
                    int n = sc.nextInt();
                    arr[i][j] = n;
                }
            }
              int cnt = 0;
            for(int x = 0; x<100; x++) {
              
            	for(int y = 0; y < 100; y++) {
                      if( arr[y][x] == 1 ) {
                         for(int p = y+1; p<100; p++) {
                            if(arr[p][x] ==2) {
                                 cnt++;
                                 break;
                            }else if(arr[p][x] == 1) {
                                break;
                            }
                         }
                 }
                }
            }
           
          System.out.println("#" + tc + " " +cnt);
        }
		
	

		
	}
}
import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr= new int[n][n];
		for(int i = 0; i <n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j =0; j <n; j++){
				int num = Integer.parseInt(st.nextToken());
				arr[i][j] = num;
			}
		}
		
		int sum = 0;
		int a = 0;
		  int b = 0;
		for(int x = 0; x <n; x++) {
		
			for(int y =0; y <n; y++){
				
				if(arr[x][y] == 0) {
					a = x;
					b = y;
				}
			}
		}
		
		for(int j = 0; j < n; j++) {
			sum+= arr[a][j];
			sum+= arr[j][b];
		}
		System.out.println(sum);
	}
}
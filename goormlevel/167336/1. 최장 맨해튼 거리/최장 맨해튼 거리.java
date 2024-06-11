import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer str = new StringTokenizer(input);
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		int c = Integer.parseInt(str.nextToken());
		int d = Integer.parseInt(str.nextToken());
		
		int[] arr = {a,b,c,d};
		
		Arrays.sort(arr);
		
		int n = arr[0] - arr[3];
		
		int m = arr[1] - arr[2];
		
		
		
		 int answer = -(n + m);
		System.out.println(answer);
	}
}
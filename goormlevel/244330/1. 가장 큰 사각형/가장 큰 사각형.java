import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; 
		
		for(int i =0; i <N; i++) {
			String input = br.readLine();
			StringTokenizer str = new StringTokenizer(input);
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			arr[i] = a*b;
			
		}
		
		Arrays.sort(arr);
		System.out.println(arr[N-1]);
	}
}
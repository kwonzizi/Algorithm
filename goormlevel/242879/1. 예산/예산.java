import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			String str = br.readLine();
			StringTokenizer stt = new StringTokenizer(str);
			int x = Integer.parseInt(stt.nextToken());
			int y = Integer.parseInt(stt.nextToken());
			
			arr[i] = x * y;
	
		}
		
		for(int j = 0; j < n; j++) {
			
			m = m - arr[j];
	
		}
		
		if(m < 0) {
				System.out.println("No");
			} else {
					System.out.println(m);
			}
			
	}
}
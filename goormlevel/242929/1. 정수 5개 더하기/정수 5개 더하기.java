import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer str = new StringTokenizer(input);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
			int n = Integer.parseInt(str.nextToken());
			sum += n;
			
		}
		
		System.out.println(sum);
	}
}
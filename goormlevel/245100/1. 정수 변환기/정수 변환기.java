import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			 sb.append((str.charAt(i) -'0') + m);
		}
		System.out.println(sb);
	}
}
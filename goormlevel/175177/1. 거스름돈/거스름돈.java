import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		int[] arr = {40, 20, 10, 5, 1};
		
		for(int i = 0; i < arr.length; i++) {
			cnt += n / arr[i];
			n = n % arr[i];
			
			if(n == 0) {
				break;
			}
			
		}
		
		System.out.println(cnt);
	}
}
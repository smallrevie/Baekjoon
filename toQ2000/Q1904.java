package toQ2000;
import java.io.*;
public class Q1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N+1];
		arr[0] = arr[1] = 1;
		for (int i = 2; i <= N; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		System.out.println(arr[N]);
	}
}

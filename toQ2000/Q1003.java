package toQ2000;
import java.io.*;
public class Q1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			long[] arr = {1, 0};
			for (int j = 0; j < M; j++) {
				long temp = arr[0] + arr[1];
				arr[0] = arr[1];
				arr[1] = temp;
			}
			System.out.println(arr[0] + " " + arr[1]);
		}
	}
}

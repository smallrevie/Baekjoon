package toQ2000;
import java.io.*;
public class Q1699 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[100001];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j*j <= i; j++) {
				if (arr[i] > arr[i - j*j]+1 || arr[i] == 0) {
					arr[i] = arr[i - j*j]+1;
				}
			}
		}
		System.out.println(arr[N]);
	}
}

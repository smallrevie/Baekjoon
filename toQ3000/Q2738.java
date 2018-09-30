package toQ3000;
import java.util.*;
import java.io.*;
public class Q2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for (int i = 0; i < N * 2; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
				if (i >= N) {
					for (int j = 0; j < M; j++) {
						arr[i - N][j] += Integer.parseInt(st1.nextToken());
					}
				}
				else {
					for (int j = 0; j < M; j++) {
						arr[i][j] = Integer.parseInt(st1.nextToken());
					}
				}
			}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
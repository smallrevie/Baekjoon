package toQ3000;
import java.io.*;
public class Q2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[15][15];
		for (int i = 1; i <= 15; i++) {
			arr[0][i-1] = i;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				int tmp = 0;
				for (int k = 0; k <= j; k++) {
					tmp += arr[i-1][k];
				}
				arr[i][j] = tmp;
			}
		}
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			System.out.println(arr[N][M-1]);
		}
	}
}

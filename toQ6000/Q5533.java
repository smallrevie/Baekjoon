package toQ6000;
import java.io.*;
import java.util.*;
public class Q5533 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int temp = 0;
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (k == i) {
						continue;
					}
					if (arr[i][j] == arr[k][j]) {
						temp = 0;
						break;
					}
					temp = arr[i][j];
				}
				sum += temp;
			}
			System.out.println(sum);
		}
	}
}

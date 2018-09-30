package toQ3000;
import java.io.*;
public class Q2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < 2 * N - 1; i++) {
			if (i < N) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = i * 2; j < 2 * N - 1; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = N * 2 - 2; i < j; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < (i - N + 1) * 2 + 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

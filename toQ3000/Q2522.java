package toQ3000;
import java.io.*;
public class Q2522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < (N*2) - 1; i++) {
			if (i < N) {
				for (int j = 1; j < N - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j <= i - N; j++) {
					System.out.print(" ");
				}
				for (int j = (N*2) - 1; j > i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

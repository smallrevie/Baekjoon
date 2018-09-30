package toQ11000;
import java.io.*;
public class Q10991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = N - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i) + 1; j++) {
				if (j % 2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

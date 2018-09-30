package toQ11000;
import java.io.*;
public class Q10995 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N*2; j++) {
				if (i % 2 == 1) {
					if (j % 2 == 0) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					if (j % 2 == 0) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}

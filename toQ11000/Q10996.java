package toQ11000;
import java.io.*;
public class Q10996 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
			System.out.println("*");
		}
		else {
			for (int i = 0; i < N*2; i++) {
				for (int j = 0; j < N; j++) {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						if (j % 2 == 0) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
		}
	}
}

package toQ11000;
import java.io.*;
public class Q10992 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {  
			for (int j = i; j < N - 1; j++) {
			System.out.print(" ");
			}
			if (i == 0 || i == N - 1) {
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < i * 2 + 1; j++) {
					if (j == 0 || j == i * 2) {
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
}
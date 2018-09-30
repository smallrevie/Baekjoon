package toQ3000;
import java.io.*;
public class Q2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < (a*2) - 1; i++) {
			if (i < a) {
				for (int j = a - i; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = (a*2) - 1; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

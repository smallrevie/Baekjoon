package toQ16000;
import java.io.*;
public class Q15232 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

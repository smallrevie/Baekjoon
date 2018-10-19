package toQ3000;
import java.io.*;
public class Q2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N % 4 == 0) {
			if ((N % 100 != 0 && N % 400 != 0) || N % 400 == 0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		else {
			System.out.println("0");
		}
	}
}

package toQ3000;
import java.io.*;
public class Q2721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			System.out.println(sum(Integer.parseInt(br.readLine())));
		}
	}
	public static int sum (int a) {
		int sum = 0;
		for (int i = 1; i < a + 1; i++) {
			sum += i * num(i + 1);
		}
		return sum;
	}
	public static int num (int a) {
		if (a == 1) {
			return 1;
		}
		else {
			return a + num(a-1);
		}
	}
}

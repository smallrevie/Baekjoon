package toQ10000;
import java.io.*;
public class Q9713 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(odd(num));
		}
	}
	
	static int odd(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i += 2) {
			sum += i;
		}
		return sum;
	}
}

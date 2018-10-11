package toQ3000;
import java.io.*;
public class Q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 1;
		int sum = 1;
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
			System.out.println("1");
		}
		else if (N <= 7) {
			System.out.println("2");
		}
		else {
			while (sum < N) {
				sum += (6*num);
				num++;
			}
			System.out.println(num);
		}
	}
}

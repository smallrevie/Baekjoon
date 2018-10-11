package toQ7000;
import java.io.*;
import java.util.*;
public class Q6064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int b = x;
			int count = x;
			if (b > N) {
				while (b > N) {
					b -= N;
				}
			}
			while (true) {
				if (b == y) {
					System.out.println(count);
					break;
				}
				else if (count > lcm(M, N)) {
					System.out.println("-1");
					break;
				}
				b += M;
				count += M;
				if (b > N) {
					while (b > N) {
						b -= N;
					}
				}
			}
		}
	}
	public static int gcd (int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcm (int a, int b) {
		return (a*b) / gcd(a, b);
	}
}

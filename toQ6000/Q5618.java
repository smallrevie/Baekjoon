package toQ6000;
import java.util.*;
import java.io.*;
public class Q5618 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = 0;
		if (N == 3) {
			c = Integer.parseInt(st.nextToken());
		}
		int gcd = 0;
		if (N == 2) {
			gcd = gcd(a, b);
		}
		else if (N == 3) {
			int temp = gcd(a, b);
			gcd = gcd(temp, c);
		}
		for (int i = 1; i <= gcd; i++) {
			if ((gcd % i) == 0) {
				System.out.println(i);
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
}

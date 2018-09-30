package toQ12000;
import java.util.*;
public class Q11945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String[] s = new String[M];
		for (int i = 0; i < M; i++) {
			if (M == 0 || N == 0) {
				break;
			}
			String tmp = sc.next();
			String temp = "";
			char[] c = tmp.toCharArray();
			char[] c1 = tmp.toCharArray();
			for (int j = N - 1; j >= 0; j--) {
				c1[j] = c[N - 1 - j];
			}
			for (int k = 0; k < N; k++) {
				temp += Character.toString(c1[k]);
				s[i] = temp;
			}
		}
		if (M != 0 && N != 0) {
		for (int l = 0; l < s.length; l++) {
			System.out.println(s[l]);
		}
		}
		sc.close();
	}
}

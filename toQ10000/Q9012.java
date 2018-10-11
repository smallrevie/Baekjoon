package toQ10000;
import java.io.*;
public class Q9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			char[] c = br.readLine().toCharArray();
			int open = 0;
			int close = 0;
			boolean minus = true;
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '(') {
					open++;
				}
				else {
					close++;
				}
				if (open - close < 0) {
					minus = false;
					break;
				}
			}
			if (open == close && c[c.length-1] != '(' && minus == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}

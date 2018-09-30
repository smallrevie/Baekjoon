package toQ6000;
import java.util.*;
import java.io.*;
public class Q5026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (s.equals("P=NP")) {
				System.out.println("skipped");
				continue;
			}
			else {
				st = new StringTokenizer(s, "+");
				int a = Integer.parseInt(st.nextToken("+"));
				int b = Integer.parseInt(st.nextToken("+"));
				System.out.println(a + b);
			}
		}
	}
}
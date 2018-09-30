package toQ3000;
import java.io.*;
public class Q2703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String ans = "";
			String s = br.readLine();
			String s1 = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 32) {
					ans += s.charAt(j);
					continue;
				}
				ans += s1.charAt(s.charAt(j) - 'A');
			}
			System.out.println(ans);
		}
	}
}

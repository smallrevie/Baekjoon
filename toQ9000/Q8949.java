package toQ9000;
import java.io.*;
import java.util.*;
public class Q8949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		String ans = "";
		while (a.length() != b.length()) {
			if (a.length() > b.length()) {
				b = "0" + b;
			}
			else if (a.length() < b.length()) {
				a = "0" + a;
			}
		}
		for (int i = 0; i < a.length(); i++) {
			int temp = (a.charAt(i) - '0') + (b.charAt(i) - '0');
			ans += temp;
		}
		System.out.println(ans);
	}
}

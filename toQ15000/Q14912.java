package toQ15000;
import java.io.*;
import java.util.*;
public class Q14912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		int N = Integer.parseInt(st.nextToken());
		String num = st.nextToken();
		for (int i = 1; i <= N; i++) {
			String s = Integer.toString(i);
			if (s.contains(num)) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == num.charAt(0)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
package toQ2000;
import java.io.*;
public class Q1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] tmp = br.readLine().toCharArray();
		for (int i = 1; i < N; i++) {
			char[] c = br.readLine().toCharArray();
			for (int j = 0; j < tmp.length; j++) {
				if (tmp[j] == c[j]) {
					continue;
				}
				else {
					tmp[j] = '?';
				}
			}
		}
		System.out.println(tmp);
	}
}

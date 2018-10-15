package toQ3000;
import java.io.*;
import java.util.*;
public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < num; k++) {
				System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

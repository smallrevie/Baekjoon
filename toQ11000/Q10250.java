package toQ11000;
import java.io.*;
import java.util.*;
public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int count = 1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			while (b > a) {
				b -= a;
				count++;
			}
			System.out.println((b*100) + count);
		}
	}
}

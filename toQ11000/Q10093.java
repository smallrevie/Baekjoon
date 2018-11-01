package toQ11000;
import java.io.*;
import java.util.*;
public class Q10093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		if (A == B) {
			System.out.println(0);
		}
		else {
			System.out.println(Math.abs(A - B) - 1);
			long min = Math.min(A, B);
			long max = Math.max(A, B);
			for (long i = min + 1; i < max; i++) {
				System.out.print(i + " ");
			}
		}
	}
}

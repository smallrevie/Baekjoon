package toQ16000;
import java.util.*;
import java.io.*;
public class Q15818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		long b = Integer.parseInt(st.nextToken());
		long sum = 1;
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		while (st1.hasMoreTokens()) {
			long puts = Long.parseLong(st1.nextToken());
			long temp = (puts % b);
			sum = (sum * temp) % b;
		}
		System.out.println(sum);
	}
}
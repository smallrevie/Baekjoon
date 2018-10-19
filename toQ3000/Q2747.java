package toQ3000;
import java.io.*;
public class Q2747 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dp = new int[46];
		dp[1] = 1;
		for (int i = 2; i < 46; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		int N = Integer.parseInt(br.readLine());
		System.out.println(dp[N]);
	}
}

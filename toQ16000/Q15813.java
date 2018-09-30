package toQ16000;
import java.io.*;
public class Q15813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += s.charAt(i) - 64;
		}
		System.out.println(sum);
	}
}

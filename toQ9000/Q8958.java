package toQ9000;
import java.io.*;
public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int count = 0;
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				int cur = 0;
				if (s.charAt(j) == 'O') {
					while (j+cur < s.length() && s.charAt(j+cur) == 'O') {
						cur++;
						count += cur;
					}
					j += cur;
				}
			}
			System.out.println(count);
		}
	}
}
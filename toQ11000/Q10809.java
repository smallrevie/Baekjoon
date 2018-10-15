package toQ11000;
import java.io.*;
public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for (int i = 0; i <= 25; i++) {
			char c = (char) i;
			c += 'a';
			String tmp = "";
			tmp += c;
			if (s.contains(tmp)) {
				System.out.print(s.indexOf(tmp) + " ");
			}
			else {
				System.out.print("-1 ");
			}
		}
	}
}

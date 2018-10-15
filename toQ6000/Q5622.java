package toQ6000;
import java.io.*;
public class Q5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = 0;
		for (int i = 0; i < s.length(); i++) {
			int tmp = s.charAt(i) - 'A';
			if (tmp < 3) {
				t += 2;
			}
			else if (tmp < 6) {
				t += 3;
			}
			else if (tmp < 9) {
				t += 4;
			}
			else if (tmp < 12) {
				t += 5;
			}
			else if (tmp < 15) {
				t += 6;
			}
			else if (tmp < 19) {
				t += 7;
			}
			else if (tmp < 22) {
				t += 8;
			}
			else {
				t += 9;
			}
		}
		System.out.println(t + s.length());
	}
}

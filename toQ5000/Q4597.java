package toQ5000;
import java.io.*;
public class Q4597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = br.readLine();
			if (s.equals("#")) {
				break;
			}
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					count++;
				}
			}
			for (int i = 0; i < s.length() - 1; i++) {
				System.out.print(s.charAt(i));
			}
			if (count % 2 == 1 && s.charAt(s.length() - 1) == 'o') {
				System.out.print('0');
				System.out.println();
			}
			if (count % 2 == 1 && s.charAt(s.length() - 1) == 'e') {
				System.out.print('1');
				System.out.println();
			}
			if (count % 2 == 0 && s.charAt(s.length() - 1) == 'o') {
				System.out.print('1');
				System.out.println();
			}
			if (count % 2 == 0 && s.charAt(s.length() - 1) == 'e') {
				System.out.print('0');
				System.out.println();
			}
		}
	}
}
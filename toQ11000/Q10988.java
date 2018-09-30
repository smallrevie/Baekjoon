package toQ11000;
import java.io.*;
public class Q10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = (br.readLine()).toCharArray();
		String s = new String(c);
		char[] c1 = new char[c.length];
		for (int i = 0; i < c.length; i++) {
			c1[i] = c[c.length - 1 - i];
		}
		String s1 = new String(c1);
		if (s.equals(s1)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}

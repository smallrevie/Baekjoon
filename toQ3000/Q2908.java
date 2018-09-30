package toQ3000;
import java.io.*;
public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		String s1 = "";
		String s2 = "";
		for (int i = 2; i >= 0; i--) {
			s1 += s[0].charAt(i);
			s2 += s[1].charAt(i);
		}
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		if (a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}

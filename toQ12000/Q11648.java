package toQ12000;
import java.io.*;
public class Q11648 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count = 0;
		while (s.length() != 1) {
			s = Integer.toString(kippa(s));
			count++;
		}
		System.out.println(count);
	}
	public static int kippa (String s) {
		int sum = 1;
		for (int i = 0; i < s.length(); i++) {
			sum *= s.charAt(i) - '0';
		}
		return sum;
	}
}

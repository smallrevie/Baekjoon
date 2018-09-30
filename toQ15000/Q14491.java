package toQ15000;
import java.io.*;
public class Q14491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String s = "";
		while (num != 0) {
			int temp = num % 9;
			s = String.valueOf(temp) + s;
			num /= 9;
		}
		System.out.println(s);
	}
}
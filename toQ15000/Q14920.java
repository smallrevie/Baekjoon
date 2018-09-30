package toQ15000;
import java.io.*;
public class Q14920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 1;
		int a = Integer.parseInt(br.readLine());
		while (a != 1) {
			if (a % 2 == 0) {
				a /= 2;
			}
			else {
				a = (3 * a) + 1;
			}
			count++;
		}
		bw.write(count);
	}
}

package toQ12000;
import java.io.*;
public class Q11727 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(tile(Long.parseLong(br.readLine())));
		
	}
	public static long tile(long a) {
		if (a == 1) {
			return 1;
		}
		else {
			if (a % 2 == 0) {
				return (2*tile(a - 1) + 1) % 10007;
			}
			else {
				return (2*tile(a - 1) - 1) % 10007;
			}
		}
	}
}

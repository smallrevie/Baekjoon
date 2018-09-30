package toQ11000;
import java.io.*;
public class Q10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(fibonacci(Integer.parseInt(br.readLine())));
	}
	public static int fibonacci(int a) {
		if (a == 0) {
			return 0;
		}
		else if (a == 1) {
			return 1;
		}
		else {
			return (fibonacci(a - 1) + fibonacci(a - 2));
		}
	}
}

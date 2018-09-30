package toQ4000;
import java.io.*;
public class Q3049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println((a * (a - 1) * (a - 2) * (a - 3)) / 24);
	}
}

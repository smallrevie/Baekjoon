package toQ12000;
import java.io.*;
public class Q11104 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine(), 2);
			System.out.println(num);
		}
	}
}

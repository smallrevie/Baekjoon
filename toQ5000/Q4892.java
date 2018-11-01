package toQ5000;
import java.io.*;
public class Q4892 {
	public static void main(String[] args) throws IOException {
		// 1. 3을 곱한다
		// 2. 곱한게 짝수면 2로 나누고, 아니라면 1을 더한 후 2로 나눈다
		// 3. 2에서 나온 결과에 3을 곱함
		// 4. 3에서 나온 결과를 9로 나눔
		// 5. 짝수면 2를 곱하고 홀수면 1을 더하고 2를 곱함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) {
				break;
			}
			System.out.print(count + ". ");
			count++;
			if (N % 2 == 0) {
				System.out.print("even " + ((((N*3) / 2) * 3) / 9) + "\n");
			}
			else {
				System.out.print("odd " + (((((N*3)+1) / 2) * 3) / 9) + "\n");
			}
		}
	}
}

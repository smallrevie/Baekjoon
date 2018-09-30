package toQ4000;
import java.io.*;
public class Q3896 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[1300000];
		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i < 1300000; i++) {
			arr[i] = true;
		}
		for (int i = 2; i * i < 1300000; i++) {
			if (arr[i]) {
				for (int j = i * i; j < 1300000; j += i) {
					arr[j] = false;
				}
			}
		}
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			int prev = 0;
			int next = 0;
			
			for (int j = num; j >= 0; j--) {
				if (arr[j]) {
					prev = j;
					break;
				}
			}
			for (int j = num; j <= 1300000; j++) {
				if (arr[j]) {
					next = j;
					break;
				}
			}
			if (next == 0 || prev == 0) {
				System.out.println("0");
				continue;
			}
			System.out.println(next - prev);
		}
	}
}

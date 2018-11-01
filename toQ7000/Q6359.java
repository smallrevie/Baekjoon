package toQ7000;
import java.io.*;
public class Q6359 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int a = 0; a < N; a++) {
			int num = Integer.parseInt(br.readLine());
			boolean[] arr = new boolean[num+1];
			int count = 0;
			for (int i = 1; i <= num; i++) {
				arr[i] = true;
			}
			for (int i = 2; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					if (j%i == 0) {
						if (arr[j] == false) {
							arr[j] = true;
						}
						else {
							arr[j] = false;
						}
					}
				}
			}
			for (int i = 0; i <= num; i++) {
				if (arr[i] == true) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

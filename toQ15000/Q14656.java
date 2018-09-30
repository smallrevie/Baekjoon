package toQ15000;
import java.util.*;
import java.io.*;
public class Q14656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp != i+1) {
				arr[i] = false;
			}
			else {
				arr[i] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (!arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}

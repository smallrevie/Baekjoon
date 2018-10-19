package toQ3000;
import java.io.*;
import java.util.*;
public class Q2846 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int diff = 0;
		int min = arr[0];
		for (int i = 1; i < N; i++) {
			if (i == N-1) {
				if (arr[i] <= arr[i-1]) {
					continue;
				}
				else {
					diff = Math.max(diff, arr[i] - min);
				}
			}
			if (arr[i] > arr[i-1]) {
				continue;
			}
			else {
				diff = Math.max(diff, arr[i-1] - min);
				min = arr[i];
			}
		}
		System.out.println(diff);
	}
}

package toQ12000;
import java.io.*;
import java.util.*;
public class Q11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1];
		arr[1] = Integer.parseInt(st1.nextToken());
		for (int i = 2; i <= N; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st1.nextToken());
		}
		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int O = Integer.parseInt(st2.nextToken());
			int P = Integer.parseInt(st2.nextToken());
			System.out.println(arr[P] - arr[O-1]);
		}
	}
}

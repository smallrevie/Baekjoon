package toQ11000;
import java.io.*;
import java.util.*;
public class Q10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		for (int i = 0; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st1.nextToken());
			int B = Integer.parseInt(st1.nextToken());
			int temp = arr[A-1];
			arr[A-1] = arr[B-1];
			arr[B-1] = temp;
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

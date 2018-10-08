package toQ2000;
import java.io.*;
import java.util.*;
public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float sum = 0f;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		float[] arr1 = new float[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = (float)(arr[i]) / (float) (arr[N-1]) * 100f;
		}
		for (int i = 0; i < N; i++) {
			sum += arr1[i];
		}
		System.out.println(sum / N);
	}
}

package toQ3000;
import java.io.*;
import java.util.Arrays;
public class Q2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int i = 0; i < N ; i++) {
				arr[i] = arr[i] * (N-i);
		}
		Arrays.sort(arr);
		System.out.println(arr[N-1]);
	}
}

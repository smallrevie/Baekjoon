package toQ2000;
import java.io.*;
public class Q1094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = {64, 32 ,16, 8, 4, 2, 1};
		for (int i = 0; i < arr.length; i++) {
			if (N >= arr[i]) {
				count++;
				N -= arr[i];
			}
		}
		System.out.println(count);
	}
}

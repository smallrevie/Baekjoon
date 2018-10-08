package toQ5000;
import java.io.*;
import java.util.*;
public class Q4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double M = Double.parseDouble(st.nextToken());
			int[] arr = new int[(int)(M)];
			int avr = 0;
			double count = 0d;
			for (int j = 0; j < M; j++) {
				int temp = Integer.parseInt(st.nextToken());
				avr += temp;
				arr[j] = temp;
			}
			avr /= M;
			Arrays.sort(arr);
			for (int j = 0; j < M; j++) {
				if (arr[j] > avr) {
					count++;
				}
			}
			double result = count / M * 100d;
			System.out.printf("%.3f" + "%%" + "%n", result);
		}
	}
}

package toQ2000;
import java.io.*;
public class Q1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		int[] arr = new int[9];
		for (int i = 0; i < c.length; i++) {
			if (c[i] - '0' == 9) {
				arr[6]++;
				continue;
			}
			arr[c[i] - '0']++;
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		if (index == 6) {
			if (max % 2 == 1) {
				System.out.println((max + 1) / 2);
			}
			else {
				System.out.println(max / 2);
			}
		}
		else {
			System.out.println(max);
		}
	}
}

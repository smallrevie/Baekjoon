package toQ5000;
import java.io.*;
public class Q4641 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int count = 0;
			String[] s = br.readLine().split("\\s");
			if (s[0].equals("-1") && s.length == 1) {
				break;
			}
			int[] arr = new int[s.length - 1];
			for (int i = 0; i < s.length - 1; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] * 2 == arr[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

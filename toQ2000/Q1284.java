package toQ2000;
import java.io.*;
public class Q1284 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {5, 3, 4, 4, 4, 4, 4, 4, 4, 4};
		while (true) {
			int count = 0;
			String s = br.readLine();
			if (s.equals("0")) {
				break;
			}
			for (int i = 0; i < s.length(); i++) {
				String tmp = "";
				tmp += s.charAt(i);
				count += arr[Integer.parseInt(tmp)];
				tmp = "";
			}
			System.out.println(count+1);
		}
	}
}

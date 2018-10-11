package toQ2000;
import java.io.*;
public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = N;
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			boolean[] arr = new boolean[26];
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j-1) != s.charAt(j)) {
					if (arr[s.charAt(j) - 97] == true) {
						count--;
						break;
					}
					arr[s.charAt(j-1) - 97] = true;	
				}
			}
		}
		System.out.println(count);
	}
}
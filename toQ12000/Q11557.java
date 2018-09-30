package toQ12000;
import java.io.*;
import java.util.*;
public class Q11557 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int T = Integer.parseInt(br.readLine());
			String label = "";
			int a = 0;
			for (int j = 0; j < T; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String temp = st.nextToken();
				int tmp = Integer.parseInt(st.nextToken());
				if (a < tmp) {
					a = tmp;
					label = temp;
				}
			}
			System.out.println(label);
		}
	}
}

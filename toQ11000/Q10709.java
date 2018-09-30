package toQ11000;
import java.io.*;
import java.util.*;
public class Q10709 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = 0; i < a; i++) {
			String s = br.readLine();
			if (s.contains("c")) {
				int index = s.indexOf("c");
				for (int j = 0; j < index; j++) {
					System.out.print("-1 ");
				}
				for (int j = index; j < b; j++) {
					if (s.charAt(j) == 'c') {
						count = 0;
					}
					System.out.print(count + " ");
					count++;
				}
			}
			else {
				for (int j = 0; j < b; j++) {
					System.out.print("-1 ");
				}
			}
		}
	}
}
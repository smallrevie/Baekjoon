package toQ3000;
import java.io.*;
import java.util.*;
public class Q2975 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			if (A == 0 && s.equals("W") && B == 0) {
				break;
			}
			if (s.equals("W")) {
				if (A - B < -200) {
					System.out.println("Not allowed");
				}
				else {
					System.out.println(A - B);
				}
			}
			if (s.equals("D")) {
				System.out.println(A + B);
			}
		}
	}
}

package toQ11000;
import java.util.*;
import java.io.*;
public class Q10821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		int count = 0;
		while (st.hasMoreTokens()) {
			if (Double.parseDouble(st.nextToken()) % 1 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

package toQ3000;
import java.io.*;
import java.util.*;
public class Q2506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Vector<Integer> arr = new Vector<Integer>(testcase + 1, 1);
		for (int i = 0; i < testcase; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		arr.add(0);
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			int plus = 0;
			if (arr.elementAt(i) == 1) {
				while (arr.elementAt(i + plus) != 0) {
					sum += plus + 1;
					plus++;
				}
				i += plus;
			}
		}
		System.out.println(sum);
	}
}

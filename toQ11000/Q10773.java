package toQ11000;
import java.util.*;
import java.io.*;
public class Q10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Vector<Integer> vc = new Vector<Integer>(1, 1);
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			vc.add(num);
		}
		int sum = 0;
		for (int i = 0; i < vc.size() - 1; i++) {
			if (vc.elementAt(i + 1) == 0) {
				vc.remove(i + 1);
				vc.remove(i);
				i -= 2;
			}
		}
		for (int i = 0; i < vc.size(); i++) {
			sum += vc.elementAt(i);
		}
		System.out.println(sum);
	}
}

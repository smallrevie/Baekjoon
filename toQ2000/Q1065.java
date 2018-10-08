package toQ2000;
import java.io.*;
import java.util.*;
public class Q1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> vc = new Vector<Integer>();
		for (int i = 1; i <= 99; i++) {
			vc.add(i);
		}
		for (int i = 100; i < 1000; i++) {
			String temp = String.valueOf(i);
			if (((temp.charAt(0) - '0') - (temp.charAt(1) - '0')) == ((temp.charAt(1) - '0')) - (temp.charAt(2) - '0')) {
				vc.add(i);
			}
		}
		int N = Integer.parseInt(br.readLine());
		int M = vc.size();
		Collections.reverse(vc);
		for (int i = 0; i < M; i++) {
			if (vc.elementAt(0) > N) {
				vc.remove(0);
			}
			else {
				break;
			}
		}
		System.out.println(vc.size());
	}
}

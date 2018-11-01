package toQ6000;
import java.io.*;
import java.util.*;
public class Q5217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			Vector<String> vc = new Vector<String>();
			int num = Integer.parseInt(br.readLine());
			System.out.print("Pairs for " + num + ": ");
			for (int j = 1; j <= num/2; j++) {
				for (int k = 1; k < num; k++) {
					if (j == k) {
						continue;
					}
					if (j + k == num) {
						vc.add(j + " " + k);
					}
				}
			}
			for (int j = 0; j < vc.size(); j++) {
				if (j == vc.size() - 1) {
					System.out.print(vc.elementAt(j));
				}
				else {
					System.out.print(vc.elementAt(j) + ", ");
				}
			}
			System.out.println();
		}
	}
}

package toQ11000;
import java.io.*;
import java.util.*;
public class Q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<Integer> vc = new Vector<Integer>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				vc.add(0, Integer.parseInt(st.nextToken()));
			}
			else if (s.equals("pop")) {
				if (vc.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(vc.elementAt(0));
					vc.remove(0);
				}
			}
			else if (s.equals("size")) {
				System.out.println(vc.size());
			}
			else if (s.equals("empty")) {
				if (vc.isEmpty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if (s.equals("top")) {
				if (vc.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(vc.elementAt(0));
				}
			}
		}
	}
}
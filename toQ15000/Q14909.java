package toQ15000;
import java.io.*;
import java.util.*;
public class Q14909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Vector<Integer> vc = new Vector<Integer>(1000000, 1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int a = Integer.parseInt(st.nextToken());
			if (a <= 0) {
				continue;
			}
			vc.add(a);
		}
		System.out.println(vc.size());
		bw.flush();
		bw.close();
	}
}
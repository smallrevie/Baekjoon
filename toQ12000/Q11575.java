package toQ12000;
import java.util.*;
import java.io.*;
public class Q11575 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		final int TT = Integer.parseInt(br.readLine());

		for (int tt = 1; tt <= TT; tt++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			char[] c = br.readLine().toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				int temp = c[i] - 'A';
				temp = (a*temp+b) % 26;
				c[i] = (char) ('A' + temp);
			}
			String s = new String(c);
			sb.append(s+"\n");
		}
		System.out.println(sb.toString());
	}	

}
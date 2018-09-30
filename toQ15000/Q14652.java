package toQ15000;
import java.io.*;
import java.util.*;
public class Q14652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		System.out.println((K/b) + " " + (K % b));
		bw.flush();
		bw.close();
	}
}

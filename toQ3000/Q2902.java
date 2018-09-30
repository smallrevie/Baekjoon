package toQ3000;
import java.io.*;
import java.util.*;
public class Q2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		while (st.hasMoreTokens()) {
			bw.write(st.nextToken().charAt(0));
		}
		bw.flush();
		bw.close();
	}
}

package toQ3000;
import java.io.*;
import java.util.*;
public class Q2845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int people = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			System.out.print((Integer.parseInt(st1.nextToken()) - people) + " ");
		}
	}
}
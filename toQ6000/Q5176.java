package toQ6000;
import java.io.*;
import java.util.*;
public class Q5176 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int[] arr = new int[s];
			for (int j = 0; j < s; j++) {
				arr[j] = Integer.parseInt(br.readLine());
			}
			Set<Integer> hs = new HashSet<Integer>();
			for (int j = 0; j < arr.length; j++) {
				hs.add(arr[j]);
			}
			System.out.println(s - hs.size());
		}
	}
}

package toQ2000;
import java.io.*;
import java.util.*;
public class Q1924 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
		int day = 366;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N-1; i++) {
			day -= arr[i];
		}
		day -= M;
		day %= 7;
		if (day == 1) {
			System.out.println("MON");
		}
		if (day == 2) {
			System.out.println("SUN");
		}
		if (day == 3) {
			System.out.println("SAT");
		}
		if (day == 4) {
			System.out.println("FRI");
		}
		if (day == 5) {
			System.out.println("THU");
		}
		if (day == 6) {
			System.out.println("WED");
		}
		if (day == 0) {
			System.out.println("TUE");
		}
	}
}

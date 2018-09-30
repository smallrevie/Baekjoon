package toQ15000;
import java.util.*;
import java.io.*;
public class Q14724 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int higher = 0;
		int counter = 0;
		int[] arr = new int[N];
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			if (arr[N - 1] > higher) {
				higher = arr[N - 1];
				counter = i;
			}
		}
		switch (counter) {
			case 0 :
				System.out.println("PROBRAIN");
				break;
			case 1 :
				System.out.println("GROW");
				break;
			case 2 :
				System.out.println("ARGOS");
				break;
			case 3 :
				System.out.println("ADMIN");
				break;
			case 4 :
				System.out.println("ANT");
				break;
			case 5 :
				System.out.println("MOTION");
				break;
			case 6 :
				System.out.println("SPG");
				break;
			case 7 :
				System.out.println("COMON");
				break;
			case 8 :
				System.out.println("ALMIGHTY");
		}
	}
}

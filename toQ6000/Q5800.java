package toQ6000;
import java.util.*;
public class Q5800 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextInt();
		for (int i = 0; i < N; i++) {
			String[] s = sc.nextLine().split("\\s");
			int[] arr = new int[s.length - 1];
			for (int j = 1; j < s.length; j++) {
				arr[j-1] = Integer.parseInt(s[j]);
			}
			Arrays.sort(arr);
			int gap = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				gap = Math.max(gap, Math.abs(arr[j] - arr[j+1]));
			}
			System.out.println("Class " + (i + 1));
			System.out.println("Max " + arr[arr.length - 1] + ", Min " + arr[0] + ", Largest gap " + gap);
		}
		sc.close();
	}
}

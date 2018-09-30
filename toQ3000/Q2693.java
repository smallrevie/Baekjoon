package toQ3000;
import java.util.*;
public class Q2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[10];
		for (int i = 0; i < N; i++) {
			String[] s = sc.nextLine().split("\\s");
			for (int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(s[j]);
			}
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
		sc.close();
	}
}

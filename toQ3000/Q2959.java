package toQ3000;
import java.util.*;
public class Q2959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		System.out.println(arr[0] * arr[2]);
		sc.close();
	}
}

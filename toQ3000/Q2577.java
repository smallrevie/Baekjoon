package toQ3000;
import java.util.*;
public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = A * B * C;
		int[] arr = new int[10];
		String s = String.valueOf(result);
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - '0']++;
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(arr[j]);
		}
		sc.close();
	}
}

package toQ10000;
import java.util.*;
public class Q9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		for (int i = 3; i < 15; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		int N = sc.nextInt();
		for (int i = 0 ; i < N; i++) {
			int A = sc.nextInt();
			System.out.println(arr[A-1]);
		}
		sc.close();
	}
}

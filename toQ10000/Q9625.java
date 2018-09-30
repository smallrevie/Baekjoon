package toQ10000;
import java.util.*;
public class Q9625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int[][] arr = new int[K][2];
		arr[0][0] = 0;
		arr[0][1] = 1;
		for (int i = 1; i < K; i++ ) {
			arr[i][0] = arr[i-1][1];
			arr[i][1] = arr[i-1][0] + arr[i-1][1];
		}
			System.out.println(arr[K-1][0] + " " + arr[K-1][1]);
			sc.close();
	}
}

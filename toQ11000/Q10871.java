package toQ11000;
import java.util.*;
public class Q10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, n, a;
		x = sc.nextInt();
		n = sc.nextInt();
		
		int[] arr = new  int[n];
		for (int i = 0; i < arr.length; i++) {
			a = sc.nextInt();
			arr[i] = a;
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < x) {
			System.out.print(arr[j] + " ");
			}
		}
		sc.close();
		System.out.println();
	}
}

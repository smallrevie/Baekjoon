package toQ2000;
import java.util.*;
public class Q1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		int[] array1 = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		Arrays.sort(array1);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += array[i] * array1[n - 1 - i];
		}
		System.out.print(sum);
		sc.close();
	}
}

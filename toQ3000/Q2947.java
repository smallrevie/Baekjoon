package toQ3000;
import java.util.*;
public class Q2947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = 0; k < arr.length -1 -j; k++) {
				if(arr[k] > arr[k+1]) {
					int tmp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = tmp;
					for (int l = 0; l < arr.length; l++) {
						System.out.print(arr[l] + " ");
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}

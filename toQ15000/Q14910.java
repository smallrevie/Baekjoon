package toQ15000;
import java.util.*;
public class Q14910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String[] s = sc.nextLine().split("\\s");
		int[] arr = new int[s.length];
		int[] arr1 = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);
		for (int j = 0 ;j < arr.length; j++) {
			if (arr[j] == arr1[j]) {
				count++;
			}
		}
		if (count == arr.length) {
			System.out.print("Good");
		}
		else {
			System.out.print("Bad");
		}
		sc.close();
	}
}

package toQ2000;
import java.util.*;
public class Q1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int count = 0;
		String[] arr = new String[N];
		int[] arr1 = new int[26];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		for (int j = 0; j < N; j++) {
			arr1[arr[j].charAt(0) - 'a']++;
		}
		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] >= 5) {
				System.out.print((char) (k+'a'));
				count++;
			}
		}
		if (count == 0) {
			System.out.print("PREDAJA");
		}
		sc.close();
	}
}

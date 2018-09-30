package toQ3000;
import java.util.*;
public class Q2953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int who = 0;
		int[] arr = new int[4];
		for (int i = 0; i < 5; i++) {
			int sum = 0;
				String[] s = sc.nextLine().split("\\s");
				for (int k = 0; k < s.length; k++) {
					arr[k] = Integer.parseInt(s[k]);
					sum += arr[k];
			}
				if (sum > max) {
					max = sum;
					who = i+1;
			}
		}
		System.out.print(who + " " + max);
		sc.close();
	}
}

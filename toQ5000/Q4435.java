package toQ5000;
import java.util.*;
public class Q4435 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int[] gand = new int[6];
		int[] saur = new int[7];
		for (int i = 0; i < T; i++) {
			String[] g = sc.nextLine().split("\\s");
			String[] s = sc.nextLine().split("\\s");
			for (int j = 0; j < 6; j++) {
				gand[j] = Integer.parseInt(g[j]);
			}
			for (int k = 0; k < 7; k++) {
				saur[k] = Integer.parseInt(s[k]);
			}
			if (sum(gand) > sum(saur)) {
				System.out.println("Battle " + (i+1) + ": Good triumphs over Evil");
			}
			else if (sum(gand) < sum(saur)) {
				System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good");
			}
			else if (sum(gand) == sum(saur)) {
				System.out.println("Battle " + (i+1) + ": No victor on this battle field");
			}
		}
		sc.close();
	}
	
	public static int sum(int[] arr) {
		int summary = 0;
		if (arr.length == 6) {
			summary = (arr[0]) + (arr[1] * 2) + (arr[2] * 3) + (arr[3] * 3) + (arr[4] * 4) + (arr[5] * 10);
		}
		else if (arr.length == 7) {
			summary = arr[0] + arr[1] * 2 + arr[2] * 2 + arr[3] * 2 + arr[4] * 3 + arr[5] * 5 + arr[6] * 10;
		}
		return summary;
	}
}

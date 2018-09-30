package toQ5000;
import java.util.*;
public class Q4493 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int p1 = 0;
		int p2 = 0;
		for(int i = 0; i < t; i++) {
			int N = sc.nextInt();
			p1 = 0;
			p2 = 0;
			sc.nextLine();
			for (int j = 0; j < N; j++) {
				String s = sc.nextLine();
				String[] arr = s.split(" ");
				if (arr[0].equals("R")) {
					if (arr[1].equals("S")) {
						p1++;
					}
					if (arr[1].equals("P")) {
						p2++;
					}
				}
				else if (arr[0].equals("S")) {
					if (arr[1].equals("R")) {
						p2++;
					}
					if (arr[1].equals("P")) {
						p1++;
					}
				}
				else if (arr[0].equals("P")) {
					if (arr[1].equals("S")) {
						p2++;
					}
					if (arr[1].equals("R")) {
						p1++;
					}
				}
			}
			if (p1 > p2) {
				System.out.println("Player 1");
			}
			else if (p1 < p2) {
				System.out.println("Player 2");
			}
			else {
				System.out.println("TIE");
			}
		}
		sc.close();
	}
}

package toQ10000;
import java.util.*;
public class Q9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			if (N == -1) {
				break;
			}
			int sum = 0;
			Vector<Integer> vc = new Vector<Integer>(1, 1);
			for (int i = 1; i * i <= N; i++) {
				if (N % i == 0) {
					vc.add(i);
					if (i != N / 1) {
						vc.add(N / i);
					}
				}
			}
			Collections.sort(vc);
			for (int i = 0; i < vc.size()-1; i++) {
				sum += vc.elementAt(i);
			}
			if (sum == N) {
				System.out.print(N + " = ");
				for (int i = 0; i < vc.size() - 1; i++) {
					if (i != vc.size() - 2) {
						System.out.print(vc.elementAt(i) + " + ");
					}
					else {
						System.out.println(vc.elementAt(i));
					}
				}
			}
			else {
				System.out.println(N + " is NOT perfect.");
			}
		}
		sc.close();
	}
}

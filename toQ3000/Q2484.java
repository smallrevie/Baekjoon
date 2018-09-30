package toQ3000;
import java.util.*;
public class Q2484 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			int result = 0;
			String[] s = sc.nextLine().split("\\s");
			Arrays.sort(s);
			if (s[0].equals(s[1]) && s[1].equals(s[2]) && s[2].equals(s[3])) {
				result = 50000 + (Integer.parseInt(s[0]) * 5000);
			}
			else if ((s[0].equals(s[1]) && s[0].equals(s[2]))
					||(s[1].equals(s[2]) && s[2].equals(s[3]))) {
				result = 10000 + ((Integer.parseInt(s[2]) * 1000));
			}
			else if (s[0].equals(s[1]) && s[2].equals(s[3])) {
				result = 2000 + ((Integer.parseInt(s[0]) * 500) + (Integer.parseInt(s[2]) * 500));
			}
			else if (s[0].equals(s[1]) 
					||s[1].equals(s[2])) {
				result = 1000 + (Integer.parseInt(s[1]) * 100);
			}
			else if (s[2].equals(s[3])) {
				result = 1000 + (Integer.parseInt(s[2]) * 100);
			}
			else {
				result = (Integer.parseInt(s[3]) * 100);
			}
			if (max < result) {
				max = result;
			}
					
		}
		
		System.out.print(max);
		sc.close();
	}
}

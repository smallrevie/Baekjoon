package toQ4000;
import java.util.*;
public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> t = new TreeSet<Integer>();
		for (int i = 0; i < 10; i++) {
			t.add(sc.nextInt() % 42);
		}
		sc.close();
		System.out.println(t.size());
	}
}

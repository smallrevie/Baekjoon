package toQ5000;
import java.util.*;
public class Q4673 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 1; i < 10000; i++) {
			int sum = 0;
			String temp = String.valueOf(i);
			for (int j = 0; j < temp.length(); j++) {
				sum += temp.charAt(j) - '0';
			}
			sum += i;
			hs.add(sum);
		}
		for (int i = 1; i < 10000; i++) {
			if (hs.contains(i)) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}

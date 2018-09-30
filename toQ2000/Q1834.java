package toQ2000;
import java.util.*;
public class Q1834 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long sum = 0L;
		for (int i = n-1; i > 0; i--) {
			sum += (long) (n+1) * (i);
		}
		System.out.print(sum);
		sc.close();
	}
}
/*
		 나누는 값과 몫이 같아지기 직전의 수.
		 1 => 없음
		 2 => 3 (몫 1, 나머지 1) 3
		 3 => 4, 8 (몫 1, 2, 나머지 1, 2) 12
		 4 => 5, 10, 15 (몫 1, 2, 3 나머지 1, 2, 3) 30
		 5 => 6, 12, 18, 24 (몫 1, 2, 3, 4 나머지 1, 2, 3, 4) 60
		 
		 즉, (n+1) * (n-1) 까지의 값.
		 */
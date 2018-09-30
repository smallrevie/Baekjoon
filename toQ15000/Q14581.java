package toQ15000;
import java.util.*;
public class Q14581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String[][] arr = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					arr[i][j] = (":" + id + ":");
				}
				else {
					arr[i][j] = (":fan:");
				}
			}
		}
		for (int k = 0; k < 3; k++) {
			if (k > 0) {
				System.out.println();			}
			for (int l = 0; l < 3; l++) {
				System.out.print(arr[k][l]);
			}
		}
		sc.close();
	}
}

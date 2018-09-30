package toQ14000;
import java.util.*;
public class Q13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split("\\s");
		int[][] arr = new int[6][2];
		int result = 0;
		for (int i = 0; i < Integer.parseInt(info[0]); i++) {
			String[] num = sc.nextLine().split("\\s");
			arr[Integer.parseInt(num[1]) - 1][Integer.parseInt(num[0])]++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				result += Math.ceil(arr[i][j] / Double.parseDouble(info[1]));
			}
		}
		System.out.println(result);
		sc.close();
	}
}

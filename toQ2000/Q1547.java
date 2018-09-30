package toQ2000;
import java.util.*;
public class Q1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[3];
		arr[0] = 1; // 처음 공의 위치
		int temp;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt(); // 바꿀 대상
			int Y = sc.nextInt(); // 바꿀 대상
			
			temp = arr[X-1]; // X번째 컵을 들고
			arr[X-1] = arr[Y-1]; // X번째 컵 의 위치에 Y번째 컵을 놓는다.
			arr[Y-1] = temp; // Y번째 컵의 위치에 X번째의 컵을 놓는다.
		}
		for (int j = 0; j < 3; j++) {
			// 컵을 들어 위치를 확인한 후
			if (arr[j] == 1) {
			System.out.println(j+1); // 공이 있던 컵의 위치를 출력.
			}
		}
		sc.close();
	}
}

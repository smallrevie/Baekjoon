package toQ2000;
import java.io.*;
public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[4000][4000];
		int verEvenDef = 0;
		int horOddDef = 1;
		arr[0][0] = 1;
		for (int i = 0; i < 3999; i++) {
			if (i % 2 == 0) {
				arr[i+1][0] = arr[i][0] + 2 + (4*verEvenDef);
			}
			else {
				arr[i+1][0] = arr[i][0] + 1;
				verEvenDef++;
			}
			for (int j = 0; j < 3999; j++) {
				if (i == 0) {
					if (j % 2 == 0) {
						arr[i][j+1] = arr[i][j] + 1;
					}
					else {
						arr[i][j+1] = arr[i][j] + (2*(j+1));
					}
				}
				else if (i%2 == 1) {
					if (j%2 == 0) {
						arr[i][j+1] = arr[i][j] + (2*(j+1)); 
					}
					else {
						arr[i][j+1] = arr[i][j] + horOddDef;
					}
				}
				else if (i%2 == 0) {
					if (j%2 == 0) {
						arr[i][j+1] = arr[i][j] + horOddDef;
					}
					else {
						arr[i][j+1] = arr[i][j] + (2*(j+1));
					}
				}
			}
			horOddDef += 2;
		}
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < 4000; i++) {
			for (int j = 0; j < 4000; j++) {
				if (arr[i][j] == num) {
					System.out.println((i+1) + "/" + (j+1));
				}
			}
		}
	}
}

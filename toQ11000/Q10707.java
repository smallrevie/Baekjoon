package toQ11000;
import java.io.*;
public class Q10707 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int Y1 = Integer.parseInt(br.readLine());
		int Y2 = Integer.parseInt(br.readLine());
		int Y3 = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int sumX = X * P;
		int less = P - Y2;
		if (less < 0) {
			less = 0;
		}
		int sumY = Y1 + (less * Y3);
		System.out.println(Math.min(sumX, sumY));
	}
}

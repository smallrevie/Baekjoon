package toQ11000;
import java.io.*;
public class Q10420 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dayz = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year = 2014;
		int month = 4;
		int day = 1;
		int num = Integer.parseInt(br.readLine());
		day += num;
		while (day > dayz[month-1]) {
			if (day > dayz[month-1]) {
				if (month == 2 && year % 4 == 0) {
					day -= (dayz[month-1]+1);
				}
				else {
					day -= dayz[month-1];
				}
				month++;
			}
			if (month > 12) {
				year++;
				month -= 12;
			}
		}
		System.out.printf(year + "-" + "%02d" + "-" + "%02d", month, day);
	}
}

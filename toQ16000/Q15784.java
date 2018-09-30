package toQ16000;
import java.io.*;
import java.util.Arrays;
public class Q15784 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s");
		if (Integer.parseInt(str[0]) == 1) {
		  System.out.println("HAPPY");
        }
        else {
		int[] arr = new int[Integer.parseInt(str[0]) - 1];
		int[] arr1 = new int[Integer.parseInt(str[0]) - 1];
		int count = 0;
		int count1 = 0;
		int val = 0;
		for (int i = 0; i < Integer.parseInt(str[0]); i++) {
			String[] str1 = br.readLine().split("\\s");
			if (i == Integer.parseInt(str[1]) - 1) {
				for (int j = 0; j < Integer.parseInt(str[0]); j++) {
					if (j == Integer.parseInt(str[2]) - 1) {
						val = Integer.parseInt(str1[j]);
						continue;
					}
					arr1[count1] = Integer.parseInt(str1[j]);
					count1++;
				}
				continue;
			}
			arr[count] = Integer.parseInt(str1[Integer.parseInt(str[2]) - 1]);
			count++;
		}
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if (val >= arr[arr.length - 1]) {
			if (val >= arr1[arr1.length - 1]) {
				System.out.println("HAPPY");
			}
			else {
				System.out.println("ANGRY");
			}
		}
		else {
			System.out.println("ANGRY");
		}
		}
	}
}

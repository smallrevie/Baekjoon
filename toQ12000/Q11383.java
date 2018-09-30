package toQ12000;
import java.io.*;
import java.util.*;
public class Q11383 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String[] arr = new String[a];
		String[] arr1 = new String[a];
        int count = 0;
		for (int i = 0; i < a; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < a; i++) {
			arr1[i] = br.readLine();
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if(arr[i].charAt(j) != arr1[i].charAt(j * 2) || arr[i].charAt(j) != arr1[i].charAt(j * 2 + 1)) {
                    count++;
					break;
				}
			}
		}
        if (count == 0) {
            System.out.println("Eyfa");
        }
        else {
            System.out.println("Not Eyfa");
        }
	}
}
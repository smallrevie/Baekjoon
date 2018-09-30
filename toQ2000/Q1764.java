package toQ2000;
import java.util.*;
public class Q1764 {
	public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = Integer.parseInt(scan.nextLine().trim());
        
        Set<String> nSet = new HashSet<String>();
        String[] mSet = new String[M];
        Set<String> result = new HashSet<String>();
        for(int i=0; i<N; i++) { 
            String input = scan.nextLine().trim();
            nSet.add(input); 
        }
        for(int i=0; i<M; i++) { 
            String input = scan.nextLine().trim(); 
            mSet[i] = input; 
        } 
        for(int i=0; i<M; i++) {
            if(nSet.contains(mSet[i]) == true) {
                result.add(mSet[i]); 
            }
        } 
        String[] tmp=result.toArray(new String[result.size()]);
        Arrays.sort(tmp);
        System.out.println(tmp.length);
        for(int i=0; i<tmp.length;i++) {
            System.out.println(tmp[i]);
        }
	scan.close();
    }
}

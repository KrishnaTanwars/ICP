import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int pos = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == '0') {
                    int moves = Math.min(k, i - pos);
                    if (moves > 0) {
                        arr[i] = '1';
                        arr[i - moves] = '0';
                    }
                    k -= moves;
                    pos++;
                }
            }
            System.out.println(new String(arr));
        }
    }
}

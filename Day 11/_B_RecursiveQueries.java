
    
    import java.util.*;

public class Main {
    static int MAX = 1000001;
    static int[][] cnt = new int[10][MAX];

    static int productOfDigits(int x) {
        int res = 1;
        while (x > 0) {
            int d = x % 10;
            if (d != 0) res *= d;
            x /= 10;
        }
        return res;
    }

    static int g(int x) {
        if (x < 10) return x;
        return g(productOfDigits(x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < MAX; i++) {
            int val = g(i);
            for (int k = 1; k <= 9; k++) {
                cnt[k][i] = cnt[k][i - 1] + (val == k ? 1 : 0);
            }
        }
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(cnt[k][r] - cnt[k][l - 1]);
        }
    }
}


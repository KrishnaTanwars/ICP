import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int minRice = n * (a - b);
            int maxRice = n * (a + b);
            int minPack = c - d;
            int maxPack = c + d;

            // If intersection of [minRice, maxRice] and [minPack, maxPack] exists, print "Yes"
            if (maxRice < minPack || minRice > maxPack)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}

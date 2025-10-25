
    import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // The permutation that after the function f(n) becomes sorted 
        // is the reverse of the sorted array: n, n-1, ..., 1
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

    
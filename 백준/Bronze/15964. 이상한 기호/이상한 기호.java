import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(nalpam(n,m));
    }

    private static int nalpam(int n, int m) {
        return (n + m) * (n - m);
    }
}
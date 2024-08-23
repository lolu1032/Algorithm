import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a == b && b == c ? 10000+a*1000 : a == b || a == c ? 1000+a*100 : b == c ? 1000+b*100 : a != b && b != c ? a > b && a > c ? a* 100 : b > a && b > c ? b * 100 : c * 100: 0);

    }
}

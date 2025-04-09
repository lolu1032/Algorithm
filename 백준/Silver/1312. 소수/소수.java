import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denum = sc.nextInt();
        int num = sc.nextInt();
        int idx = sc.nextInt();

        denum%=num; // 5 1 3 2

        for(int i = 1; i < idx; i++) {
            denum*=10;
            denum%=num;
        }
        denum*=10;
        int result = denum / num;
        System.out.println(result);
    }
}
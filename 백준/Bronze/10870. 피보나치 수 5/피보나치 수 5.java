
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcu(n));
    }
    static int calcu(int n) {
        if(n <= 1) {
            return n;
        }else {
            return calcu(n-1) + calcu(n-2);
        }
    }
}

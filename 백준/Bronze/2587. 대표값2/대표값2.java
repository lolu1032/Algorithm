
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i ++) {
            int n = sc.nextInt();
            a[i] = n;
            sum+=n;
        }
        Arrays.sort(a);
        System.out.println(sum/5);
        System.out.println(a[2]);
    }
}

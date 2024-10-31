
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for(int j = (n-i)*2-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            for (int k = 0; k < n - i -1; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

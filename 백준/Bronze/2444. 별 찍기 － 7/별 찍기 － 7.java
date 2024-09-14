
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n; i++) {
            for(int j = n-1; j > i-1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for(int j = i+1; j < n*2-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

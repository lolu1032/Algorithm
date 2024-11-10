
import java.time.LocalDate;
import java.util.*;

import static java.time.LocalTime.now;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j < 2*i-1; j++) {
                System.out.print(" ");
            }
            if(i > 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 0;
        for(int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if(n % 2 != 0) {
                if(min == 0) {
                    min = n;
                }
                if(min > n) {
                    min = n;
                }
                sum+=n;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}

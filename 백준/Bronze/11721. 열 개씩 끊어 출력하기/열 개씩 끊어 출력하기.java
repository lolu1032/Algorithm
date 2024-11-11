import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i = 0; i < str.length(); i++) {
            if(i%10==0) {
                if(i == 0) {
                    System.out.print(str.charAt(i));
                }else {
                    System.out.println();
                    System.out.print(str.charAt(i));
                }
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        int num = 0;
        while (str.length() > 1){
            num = 0;
            for(int i = 0; i < str.length(); i++) {
                num += str.charAt(i)-'0';
            }
            str = String.valueOf(num);
            count++;
        }
        if((str.charAt(0) - '0') % 3 == 0) {
            System.out.println(count);
            System.out.println("YES");
        }else {
            System.out.println(count);
            System.out.println("NO");
        }
    }
}
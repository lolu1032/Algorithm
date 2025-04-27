import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int zero = 0;
        int one = 0;
        if (str.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                if(str.charAt(i) == '0') {
                    zero++;
                }else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero,one));
    }
}
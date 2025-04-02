import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Character> ch = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                if(i == 0) {
                    ch.add(str.charAt(j));
                }else {
                    if(ch.get(j) != str.charAt(j)) {
                        ch.set(j, '?');
                    }
                }
            }
        }
        for(Character s : ch) {
            System.out.print(s);
        }
    }
}
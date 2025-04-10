import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                count++;
            } else {
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                convertXToPolymino(count, sb);
                sb.append(str.charAt(i));
                count = 0;
            }
        }
        if(count % 2 != 0) {
            System.out.println(-1);
        }else {
            convertXToPolymino(count, sb);
            System.out.println(sb);
        }
    }

    private static void convertXToPolymino(int count, StringBuilder sb) {
        while (count >= 4) {
            count -= 4;
            sb.append("AAAA");
        }
        while (count >= 2) {
            count -= 2;
            sb.append("BB");
        }
    }
}
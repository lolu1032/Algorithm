import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int rowCount = 0;
        int colCount = 0;

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            if (!str[i].contains("X")) {
                rowCount++;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean hasGuard = false;
            for (int j = 0; j < n; j++) {
                if (str[j].charAt(i) == 'X') {
                    hasGuard = true;
                    break;
                }
            }
            if (!hasGuard) {
                colCount++;
            }
        }
        System.out.println(Math.max(rowCount,colCount));
    }
}
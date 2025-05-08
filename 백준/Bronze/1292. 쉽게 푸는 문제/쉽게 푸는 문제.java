import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        for(int j = n-1; j < m; j++) {
            count += list.get(j);
        }
        System.out.println(count);
    }
}
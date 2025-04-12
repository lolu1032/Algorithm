import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            sc.nextLine();

            String[] name = new String[n];
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                name[i] = sc.nextLine();
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                String str = sc.nextLine();
                int num = Integer.parseInt(str.split(" ")[0]);
                if(list.contains(num)) {
                   list.remove((Integer) num);
                }else {
                    list.add(num);
                }
            }
            count++;
            if(!list.isEmpty()) {
                System.out.println(count + " " + name[list.get(0)-1]);
            }
        }
    }
}
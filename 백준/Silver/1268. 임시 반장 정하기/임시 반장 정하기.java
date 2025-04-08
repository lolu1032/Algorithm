import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][5];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j<n; j++) {
                if(i == j) continue;
                for(int k = 0; k <5; k++) {
                    if(m[i][k] == m[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            list.add(count);
        }
        int index = -1;
        int d = -1;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > d) {
                d = list.get(i);
                index = i;
            }
        }
        System.out.println(index+1);
    }
}
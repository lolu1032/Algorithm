import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 인원수
        int n = sc.nextInt();
        int count = 0;
        if(n == 1) {
            System.out.println(count);
        }else {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                // 1~n번 투표수 입력
                list.add(sc.nextInt());
            }
    
            int a = list.get(0);
            list.remove(0);
            while (true) {
                list.sort(Comparator.reverseOrder());
                if(a > list.get(0)) {
                    break;
                }
                int max = list.get(0);
                list.set(0,max-1);
                a++;
                count++;
            }
            System.out.println(count);
        }
    }
}
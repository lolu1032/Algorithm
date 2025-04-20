import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dazung = sc.nextInt();
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 1; i < n; i++) {
            queue.add(sc.nextInt());
        }

        while(!queue.isEmpty() && queue.peek() >= dazung) {
            int max = queue.poll();
            max--;
            dazung++;
            count++;

            queue.add(max);
        }
        System.out.println(count);
    }
}
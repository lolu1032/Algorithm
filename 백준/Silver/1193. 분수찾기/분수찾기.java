import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        int y = 0;
        // x(x+1) / 2 <= n 대각선 위치 구하기
        for(int i = 1; i <= n; i++) {
            if (i*(i+1) / 2 >= n) {
                x.add(i);
            }
        }
        // (n-1)*n / 2 + 1 시작위치 구하기
        int start = (x.get(0)-1) * x.get(0) / 2 + 1;
        
        // k = n - x + 1 대각선 내부 인덱스 계산
        y = n - start + 1;

        if(x.get(0) % 2 == 0) {
            System.out.printf("%d/%d",y, x.get(0)-y+1);
        }else {
            System.out.printf("%d/%d",x.get(0)-y+1, y);
        }
    }
}
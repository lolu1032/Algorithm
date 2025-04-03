import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            long k = 1;
            int east = sc.nextInt();
            int west = sc.nextInt();
            for(int i = 0; i < east; i++) { // 1 2 3 4 5 6 7 8 9 10 11 12 13
                k *= west - i;
                k /= i + 1;
            }
            System.out.println(k);
        }
    }
}
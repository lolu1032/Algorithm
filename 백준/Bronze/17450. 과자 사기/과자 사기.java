import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double afterNum = 0;
        int num = 0;
        for(int i = 0; i < 3; i++) {
            int price = sc.nextInt();
            int weight = sc.nextInt();

            double beforeNum;
            if(price * 10 >= 5000) {
                beforeNum = (double)(weight * 10) / (price * 10 - 500);
            }else {
                beforeNum = (double)(weight * 10) / (price * 10);
            }
            if(i == 0) {
                afterNum = beforeNum;
            }
            if(beforeNum > afterNum) {
                afterNum = beforeNum;
                num = i;
            }
        }
        if(num == 0) {
            System.out.println('S');
        }else if(num == 1) {
            System.out.println('N');
        }else {
            System.out.println('U');
        }
    }
}
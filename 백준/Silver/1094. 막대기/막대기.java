import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String num = Integer.toBinaryString(n);

        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
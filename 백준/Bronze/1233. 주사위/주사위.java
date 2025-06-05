import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();

        int[] freq = new int[S1 + S2 + S3 + 1];

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    freq[i + j + k]++;
                }
            }
        }

        int maxCount = 0;
        int answer = 0;
        for (int sum = 3; sum < freq.length; sum++) {
            if (freq[sum] > maxCount) {
                maxCount = freq[sum];
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}

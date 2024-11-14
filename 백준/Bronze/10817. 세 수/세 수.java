
import java.time.LocalDate;
import java.util.*;

import static java.time.LocalTime.now;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] n = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(n);
        System.out.println(n[1]);
    }
}

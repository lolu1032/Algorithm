import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            s.add(str);
        }

        Collections.sort(s);
        s.sort((a,b) -> Integer.compare(a.length(),b.length()));

        Stream<String> distinct = s.stream().distinct();

        distinct.forEach(System.out::println);
    }
}
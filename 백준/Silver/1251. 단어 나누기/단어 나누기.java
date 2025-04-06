import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> s = new ArrayList<>();

        for(int i = 1; i < n.length(); i++) {
            for(int j = i+1; j < n.length(); j++) {
                String left = new StringBuilder(n.substring(0,i)).reverse().toString();
                String mid = new StringBuilder(n.substring(i,j)).reverse().toString();
                String right = new StringBuilder(n.substring(j)).reverse().toString();

                s.add(left+mid+right);
            }
        }
        Collections.sort(s);
        System.out.println(s.get(0));
    }
}
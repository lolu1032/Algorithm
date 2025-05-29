import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] answer = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                answer[i] = String.valueOf(Character.toLowerCase(str.charAt(i)));
            }else {
                answer[i] = String.valueOf(Character.toUpperCase(str.charAt(i)));
            }
        }
        for(int i = 0; i < str.length(); i++) {
            System.out.print(answer[i]);
        }
    }
}
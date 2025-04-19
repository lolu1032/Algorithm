import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = null;
        for(int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            int n2 = Integer.parseInt(tokens[0]);
            int n3 = Integer.parseInt(tokens[1]);

            System.out.println("yes");
        }
    }

}
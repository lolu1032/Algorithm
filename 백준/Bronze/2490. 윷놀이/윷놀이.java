import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) { // <- 여러줄 처리할때씀 sc.hasNext같은거
            StringTokenizer st = new StringTokenizer(input, " ");
            int count = 0;
            while(st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) == 0) {
                    count++;
                }
            }
            if(count == 4) {
                System.out.println("D");
            } else if(count == 3) {
                System.out.println("C");
            } else if(count == 2) {
                System.out.println("B");
            } else if(count == 1) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }
    }
}

//Java String Tokens

import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = s.trim();
        String[] tokens = s1.split("[ !,?._'@]+");
        
        if (s1.isEmpty())
            System.out.println(0);
        else {
            System.out.println(tokens.length);
            for (String token: tokens)
                System.out.println(token);
        }
        scan.close();
    }
}


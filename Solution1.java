
//Sample Case 0: n=3
 n is odd and odd numbers are weird, so we print Weird.

//Sample Case 1: n=24
 n>20 and n is even, so it isn't weird. Thus, we print Not Weird.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
         if(N%2 == 0)
    {
        if(N>=2 && N<=5)
        {
            System.out.println("Not Weird");
        }
        else if(N>=6 && N<=20)
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        } 
    }
    else
    {
        System.out.println("Weird");
    }

    }


}

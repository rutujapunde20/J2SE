
//Java output formatting

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            int len = s1.length();
            String space = " ";
                for(int j=0; j<(14-len); j++){
                    space += " ";
                }
            if(x<100){
                if(x<10) System.out.println(s1+ space+"00"+x);
                else System.out.println(s1+ space + "0" + x);
            }else{
                System.out.println(s1+space+x);
            }
        }
        System.out.println("================================");

}
}




import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
  // A.B.C.D
  // 000 - 199 -> [01]?[0123456789][0123456789] or
  // 200 - 249 -> [2][01234][0123456789] or
  // 250 - 255 -> [2][5][012345]
  String range1 = "([01]?[0-9][0-9]?";
  String range2 = "|2[0-4][0-9]";
  String range3 = "|25[0-5])";
  String A = range1.concat(range2).concat(range3); // 0 - 255
  final String pattern = A + '.' + A + '.' + A + '.' + A;
}

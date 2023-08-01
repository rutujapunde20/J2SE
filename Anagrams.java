import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
        return false;
        
        a=a.toUpperCase();
        b=b.toUpperCase();
        
        int len=a.length();
        for(int i=0; i<len; i++)
        {
            
            try{
            char A=a.charAt(i);
            int index=b.indexOf(A);
            b=b.substring(0,index)+b.substring(index+1, b.length());
            }
          catch(Exception e)
            {
                return false;
            } 
            }
    if(b.length()==0)
    return true;
    else
    return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
import java.util.Scanner;

public class SubstringComp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int sizeString = s.length();
        int initialCut = 0;
        String[] cutByK = new String[sizeString - k + 1];
        
        for (int index = 0; index < cutByK.length; index++) {
            cutByK[index] = s.substring(initialCut, (k + initialCut));
            initialCut++;
        }
        
        smallest = cutByK[0];
        largest = cutByK[0];
        
        for (String text : cutByK) {
            if (smallest.compareTo(text) >= 0) {
                smallest = text;            
            }
            if (largest.compareTo(text) <= 0) {
                largest = text;
            }
        }
        
        return smallest + "\n" + largest;
    }
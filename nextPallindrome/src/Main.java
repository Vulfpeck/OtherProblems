import java.util.*;
import java.util.ArrayList;

public class Main {

    public static long nextPallingdrome(long number, long numberCopy) {
        int numLength = (int)Math.log10(numberCopy) + 1;
        String numberString = String.valueOf(numberCopy);
        String halfString, oddMid = "";
        
        if (numLength % 2 == 1) {
            oddMid = numberString.substring(numLength/2, numLength/2 + 1);
        }

        halfString = numberString.substring(0, numLength/2);
        halfString = halfString + oddMid + new StringBuilder(halfString).reverse().toString();
        
        if (Long.parseLong(halfString) > number) {
            return Long.parseLong(halfString);
        } else {
            long increment= (long) Math.pow(10, numLength/2);
            return nextPallingdrome(number, numberCopy + increment);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long pallindrome = nextPallingdrome(num, num);
        System.out.println(pallindrome);
    }    
}
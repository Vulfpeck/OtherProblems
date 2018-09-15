import java.util.Scanner;

public class AvgAsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0;
        System.out.println("Enter yo string: ");
        String input = sc.nextLine();
        for (int i=0; i<input.length(); i++) {
            sum += input.charAt(i);
        }
        float avg = sum/input.length();
        System.out.println("Average ascii value is: " + avg);
    }
}


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        String input;
        System.out.print("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        input= sc.nextLine();
        String[] reversedInput = (input.split(" "));
        Collections.reverse(Arrays.asList(reversedInput));
        System.out.println("reversed string");
        for (String s: reversedInput) {
            System.out.println(s + " ");
        }
    }
}

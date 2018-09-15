import java.util.Scanner;

public class Main {

   // more efficient solution
    public static int findZeroes(int n) {
       int count =0;
       while (n!=0){
           count += n/5;
           n /= 5;
       }
       return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yo number: ");
        int num = sc.nextInt();
        System.out.println(findZeroes(num));
    }
}

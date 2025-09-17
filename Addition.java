/*S.vishal
    24RA1A05AO
    CSE-F*/
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = input.nextInt();
        System.out.print("Enter your second number: ");
        int b = input.nextInt();
        System.out.println(a + "+" + b + "=" + (a + b));
    }
}

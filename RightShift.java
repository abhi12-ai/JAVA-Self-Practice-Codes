import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("rsult is=" + result);
    }
}

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers for addition: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("sum of two numbers is: " + (num1 + num2));
    }
}

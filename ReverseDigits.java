import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlcm to reverse digit program");
        System.out.println("enter elements");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("reversed numbers= " + reverse);
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit=num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}
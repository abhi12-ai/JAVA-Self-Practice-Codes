import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome");
        System.out.println("Enter the number to check palindrome or not");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if (isPalindrome) {
            System.out.println("is Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        return num==reverseNum(num);
    }

    public static int reverseNum(int num){
        int newNum=0;
        while (num > 0) {
            int digit=num%10;
            newNum=newNum*10+digit;
            num/=10;
        }
        return newNum;
    }
}
